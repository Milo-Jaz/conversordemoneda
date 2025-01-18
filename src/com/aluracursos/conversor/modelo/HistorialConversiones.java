package com.aluracursos.conversor.modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Gestiona el historial de conversiones y su almacenamiento.
 */
public class HistorialConversiones {
    private final List<Map<String, Object>> historial = new ArrayList<>();
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void agregarConversion(Map<String, Object> conversion) {
        historial.add(conversion);
    }

    public void guardarHistorial() {
        try (FileWriter escritor = new FileWriter("historial_conversiones.json")) {
            escritor.write(gson.toJson(historial));
            System.out.println("Historial de conversiones guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el historial.");
        }
    }
}

