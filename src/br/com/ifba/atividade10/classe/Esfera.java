/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public class Esfera extends Forma3d {
    private double raio;

    public Esfera(double raio) {
        super("Esfera");
        this.raio = raio;
    }

    /**
     * reescrevendo os métodos abaixo
     * @return 
     */
    @Override
    public double obterArea() {
        /**
         * formula para calcular área da esfera
         */
        return 4 * Math.PI * raio * raio; 
    }

    // Implementação OBRIGATÓRIA do volume
    @Override
    public double obterVolume() {
        /***
         * calculando o volume da esfera
         */
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }
    
   
    @Override
    public String toString() {
        return String.format("%s \n  Raio: %.2f", super.toString(), raio);
    }
}
