/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public class Quadrado extends Forma2d {
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    /**
     * reescrevendo os métodos abaixo da superclasse
     * @return 
     */
    @Override
    public double obterArea() {
        /**
         * formula para obter area do quadrado
         */
        return lado * lado; 
    }

    @Override
    public String toString() {
        return String.format("%s \n  Lado: %.2f", super.toString(), lado);
    }
}
