/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public class Forma2d extends Forma {

    public Forma2d(String nome) {
        /**
         * Passa o nome para a super classe
         */
        super(nome);
    }
    
    /**
     * metodos que serão reescritos na classes abaixo
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%s: \n  Tipo: 2d \n  Area: %.2f", nome, obterArea());
    }


    @Override
    public double obterArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
