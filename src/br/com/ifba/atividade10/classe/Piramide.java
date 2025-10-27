/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public class Piramide extends Forma3d {
    private double base;
    private double altura;

    public Piramide(double base, double altura) {
        super("Piramide");
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * reescrevendo os métodos abaixo da superclasse
     * @return 
     */
    
    @Override
    public double obterArea() {
        /**
         * formula para obter a area do triangulo, aproximado
         */
        return base * base + 2 * base * (altura / 2); 
    }

    @Override
    public double obterVolume() {
        /**
         * formula para obter o volume
         */
        return (1.0 / 3) * base * base * altura;
    }

    @Override
    public String toString() {
        return String.format("%s \n  Lado Base: %.2f \n  Altura: %.2f", 
                             super.toString(), base, altura);
    }
}
