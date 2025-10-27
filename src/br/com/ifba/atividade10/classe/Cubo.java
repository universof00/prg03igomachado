/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public class Cubo extends Forma3d {
    private double aresta;

    public Cubo(double aresta) {
        super("Cubo");
        this.aresta = aresta;
    }

    /**
     * reescrevendo os métodos abaixo
     * @return 
     */
    @Override
    public double obterArea() {
       /**
        * formula do cubo
        */
        return 6 * aresta * aresta; 
    }

    
    @Override
    public double obterVolume() {
        /**
         * obtendo o volume do cubo
         */
        return aresta * aresta * aresta; 
    }
    
    
    @Override
    public String toString() {
        return String.format("%s \n  Aresta: %.2f", super.toString(), aresta);
    }
}
