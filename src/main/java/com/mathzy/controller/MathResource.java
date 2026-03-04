package com.mathzy.controller;

import com.mathzy.client.PythonAgentClient;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/math")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MathResource {

    @Inject
    private PythonAgentClient aiClient;

    @GET
    @Path("/nueva-tarea")
    public Response solicitarEjercicio(@QueryParam("operacion") String operacion) {
        try {
            // Llamamos al Agente Python para obtener el ejercicio y la explicación LaTeX
            String jsonRespuesta = aiClient.obtenerEjercicioIA(operacion);
            return Response.ok(jsonRespuesta).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                           .entity("Error conectando con el Agente IA").build();
        }
    }
}