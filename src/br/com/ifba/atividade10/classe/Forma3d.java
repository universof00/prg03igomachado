/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public abstract class Forma3d extends Forma {

    
    public Forma3d(String nome) {
        /**
         * Passa o nome para a super classe
         */
        super(nome);
    }
    
     /**
     * metodos que serão reescritos na classes abaixo
     * @return 
     */
    public abstract double obterVolume();
 
    
    @Override
    public String toString() {
        return String.format("%s: \n  Tipo: /*3d*/ \n  Area Superficial: %.2f \n  Volume: %.2f", 
                             nome, obterArea(), obterVolume());
    }
}
