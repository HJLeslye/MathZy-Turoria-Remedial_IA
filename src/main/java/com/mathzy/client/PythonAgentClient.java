package com.mathzy.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
public class PythonAgentClient {
    // URL donde correrá tu Agente de Python en VS Code
    private static final String PYTHON_SERVICE_URL = "http://localhost:8000/generar/operacion";

    public String obtenerEjercicioIA(String tipo) {
        Client client = ClientBuilder.newClient();
        return client.target(PYTHON_SERVICE_URL)
                .queryParam("tipo", tipo)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
    }
}