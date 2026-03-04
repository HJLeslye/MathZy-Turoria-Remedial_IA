/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mathzy.model;

import java.util.Random;
/**
 *
 * @author ellye
 */

public class OperacionSuma implements OperationInterface {
    // Atributos privados (Encapsulamiento)
    private int numero1;
    private int numero2;

    // Constructor que inicializa aleatoriamente (0-9, excepto 0 en num1)
    public OperacionSuma() {
        Random rand = new Random();
        this.numero1 = rand.nextInt(9) + 1; // 1 al 9
        this.numero2 = rand.nextInt(10);    // 0 al 9
    }

    // Constructor con parámetros
    public OperacionSuma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getters y Setters
    public int getNumero1() { return numero1; }
    public void setNumero1(int numero1) { this.numero1 = numero1; }
    public int getNumero2() { return numero2; }
    public void setNumero2(int numero2) { this.numero2 = numero2; }

    @Override
    public int respuesta() {
        return numero1 + numero2;
    }

    @Override
    public boolean validacionRespuesta(int resultadoUsuario) {
        return resultadoUsuario == respuesta();
    }
}