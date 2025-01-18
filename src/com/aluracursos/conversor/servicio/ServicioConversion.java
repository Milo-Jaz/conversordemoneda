package com.aluracursos.conversor.servicio;

import com.aluracursos.conversor.datos.RespuestaAPI;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Servicio encargado de la conexión a la API y extracción de tasas de cambio.
 */
public class ServicioConversion {
    private static final String API_URL = " https://v6.exchangerate-api.com/v6/511ba2c65ebb82e712e9d0d7/latest/";
    private final Gson gson = new Gson();

    /**
     * Obtiene las monedas disponibles desde la API.
     * @return Conjunto de monedas.
     */
    public Set<String> obtenerMonedasDisponibles() {
        try {
            URL url = new URL(API_URL + "USD");  // Consulta con USD como base
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            if (conexion.getResponseCode() == HttpURLConnection.HTTP_OK) {
                Scanner respuestaScanner = new Scanner(conexion.getInputStream());
                StringBuilder respuestaJSON = new StringBuilder();

                while (respuestaScanner.hasNext()) {
                    respuestaJSON.append(respuestaScanner.nextLine());
                }
                respuestaScanner.close();

                RespuestaAPI datosAPI = gson.fromJson(respuestaJSON.toString(), RespuestaAPI.class);
                return datosAPI.getConversionRates().keySet();
            } else {
                System.out.println("Error de conexión. Código: " + conexion.getResponseCode());
            }

        } catch (IOException e) {
            System.out.println("Error al conectar con la API.");
        }

        return null;
    }

    /**
     * Obtiene la tasa de cambio entre dos monedas.
     * @param monedaOrigen Moneda de origen.
     * @param monedaDestino Moneda de destino.
     * @return Tasa de cambio o null si falla.
     */
    public Double obtenerTasaDeCambio(String monedaOrigen, String monedaDestino) {
        String direccion = API_URL + monedaOrigen;

        try {
            URL url = new URL(direccion);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            if (conexion.getResponseCode() == HttpURLConnection.HTTP_OK) {
                Scanner respuestaScanner = new Scanner(conexion.getInputStream());
                StringBuilder respuestaJSON = new StringBuilder();

                while (respuestaScanner.hasNext()) {
                    respuestaJSON.append(respuestaScanner.nextLine());
                }
                respuestaScanner.close();

                RespuestaAPI datosAPI = gson.fromJson(respuestaJSON.toString(), RespuestaAPI.class);

                if ("success".equals(datosAPI.getResult())) {
                    Map<String, Double> tasas = datosAPI.getConversionRates();
                    return tasas.getOrDefault(monedaDestino, null);
                }
            } else {
                System.out.println("Error de conexión. Código: " + conexion.getResponseCode());
            }

        } catch (IOException e) {
            System.out.println("Error en la conexión con la API.");
        }

        return null;
    }
}
