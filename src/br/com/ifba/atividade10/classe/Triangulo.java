/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public class Triangulo extends Forma2d {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triângulo");
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
         * formula para obter a area do triangulo
         */
        return (base * altura) / 2; 
    }
 
    
    @Override
    public String toString() {
        return String.format("%s \n  Base: %.2f \n  Altura: %.2f", 
                             super.toString(), base, altura);
    }
}
