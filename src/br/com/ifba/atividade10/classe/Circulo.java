/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public class Circulo extends Forma2d {
    private double raio;
    
    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    /**
     * reescrevendo os métodos abaixo
     * @return 
     */
    @Override
    public double obterArea() {
        /**
         * formula do circulo
         */
        return Math.PI * raio * raio; 
    }

    @Override
    public String toString() {
        // Usa o toString() da superclasse (FormaBidimensional) e adiciona um detalhe
        return String.format("%s \n  Raio: %.2f", super.toString(), raio);
    }
}
