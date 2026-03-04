package com.mathzy.view;

import com.mathzy.client.PythonAgentClient;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import org.json.JSONObject;

@Named
@ViewScoped
public class MathBean implements Serializable {

    @Inject
    private PythonAgentClient aiClient;

    // Clase estática para que JSF pueda acceder a las propiedades
    public static class OperacionDTO implements Serializable {
        private String numero1 = "0";
        private String numero2 = "0";
        public String getNumero1() { return numero1; }
        public String getNumero2() { return numero2; }
        public void setNumeros(String n1, String n2) { this.numero1 = n1; this.numero2 = n2; }
    }

    private OperacionDTO operacionActual = new OperacionDTO();
    private Double respuestaUsuario;
    private Double respuestaCorrecta;
    private String feedback = "";
    private String explicacionLatex = "Presiona 'Siguiente Ejercicio' para comenzar.";

    public void nuevaPractica() {
        try {
            // Llamada al Agente Python en puerto 8000
            String jsonRaw = aiClient.obtenerEjercicioIA("suma");
            JSONObject json = new JSONObject(jsonRaw);

            String enunciado = json.getString("enunciado");
            String[] partes = enunciado.split("\\+");
            
            this.operacionActual.setNumeros(partes[0].trim(), partes[1].trim());
            this.respuestaCorrecta = json.getDouble("resultado");
            this.explicacionLatex = json.getString("latex");
            
            this.respuestaUsuario = null;
            this.feedback = "";
        } catch (Exception e) {
            this.explicacionLatex = "Error: El Agente Python no responde en el puerto 8000.";
        }
    }

    public void evaluar() {
        if (respuestaUsuario != null && respuestaUsuario.equals(respuestaCorrecta)) {
            feedback = "¡Correcto! ✔️ Excelente trabajo.";
        } else {
            feedback = "Casi... ❌ El resultado era " + respuestaCorrecta;
        }
    }

    public OperacionDTO getOperacionActual() { return operacionActual; }
    public Double getRespuestaUsuario() { return respuestaUsuario; }
    public void setRespuestaUsuario(Double respuestaUsuario) { this.respuestaUsuario = respuestaUsuario; }
    public String getFeedback() { return feedback; }
    public String getExplicacionLatex() { return explicacionLatex; }
}