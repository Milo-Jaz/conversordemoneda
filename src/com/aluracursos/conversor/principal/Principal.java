package com.aluracursos.conversor.principal;

import com.aluracursos.conversor.modelo.BaseDeDatosMonedas;
import com.aluracursos.conversor.modelo.HistorialConversiones;
import com.aluracursos.conversor.servicio.ServicioConversion;

import java.util.*;

/**
 * Clase principal para ejecutar el conversor de monedas.
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicioConversion servicio = new ServicioConversion();
        HistorialConversiones historial = new HistorialConversiones();
        boolean salir = false;

        while (!salir) {
            mostrarMenu();

            System.out.print("Selecciona una opción (1, 2 o 3): ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    convertirMoneda(scanner, servicio, historial);
                    break;
                case "2":
                    consultarMonedas();
                    break;
                case "3":
                    System.out.println("Gracias por usar la aplicación :)");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona 1, 2 o 3.");
            }
        }

        historial.guardarHistorial();
    }

    /**
     * Muestra el menú principal de la aplicación.
     */
    private static void mostrarMenu() {
        System.out.println("\n============================");
        System.out.println("    CONVERSOR DE MONEDAS    ");
        System.out.println("============================");
        System.out.println("1. Convertir");
        System.out.println("2. Consultar país");
        System.out.println("3. Salir");
    }

    /**
     * Permite realizar una conversión de moneda obteniendo las siglas directamente desde la API.
     */
    private static void convertirMoneda(Scanner scanner, ServicioConversion servicio, HistorialConversiones historial) {
        // Obtener las monedas desde la API
        Set<String> monedasDisponibles = servicio.obtenerMonedasDisponibles();

        if (monedasDisponibles == null || monedasDisponibles.isEmpty()) {
            System.out.println("No se pudieron obtener las monedas desde la API.");
            return;
        }

        // Mostrar las monedas en el formato [USD, AED, AFN, ...]
        System.out.println("\nMonedas disponibles: " + monedasDisponibles);

        // Solicitar la moneda de origen
        System.out.print("\nIntroduce la moneda de origen (ejemplo: USD): ");
        String origen = scanner.nextLine().toUpperCase();

        if (!monedasDisponibles.contains(origen)) {
            System.out.println("Moneda de origen no válida.");
            return;
        }

        // Solicitar la moneda de destino
        System.out.print("Introduce la moneda de destino (ejemplo: EUR): ");
        String destino = scanner.nextLine().toUpperCase();

        if (!monedasDisponibles.contains(destino)) {
            System.out.println("Moneda de destino no válida.");
            return;
        }

        // Solicitar la cantidad a convertir
        System.out.print("Introduce la cantidad: ");
        double cantidad;

        try {
            cantidad = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Cantidad inválida. Debe ser un número.");
            return;
        }

        // Obtener la tasa de cambio desde la API
        Double tasa = servicio.obtenerTasaDeCambio(origen, destino);

        if (tasa != null) {
            double resultado = cantidad * tasa;
            System.out.printf("%.2f %s equivalen a %.2f %s%n", cantidad, origen, resultado, destino);

            // Guardar la conversión en el historial
            Map<String, Object> conversion = new HashMap<>();
            conversion.put("origen", origen);
            conversion.put("destino", destino);
            conversion.put("cantidad", cantidad);
            conversion.put("resultado", resultado);

            historial.agregarConversion(conversion);
        } else {
            System.out.println("No se pudo obtener la tasa de cambio.");
        }
    }


    /**
     * Consulta las monedas y sus países desde la base de datos interna.
     */
    private static void consultarMonedas() {
        Map<String, String> monedas = BaseDeDatosMonedas.obtenerMonedas();
        System.out.println("\nMonedas disponibles:");
        int contador = 1;
        for (Map.Entry<String, String> moneda : monedas.entrySet()) {
            System.out.println("   " + contador + ". " + moneda.getKey() + " - " + moneda.getValue());
            contador++;
        }
    }
}
