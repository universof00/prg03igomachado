/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public abstract class Forma {
    /**
     * somente quem herdar poderá manipular o nome
     */
    protected String nome;

    
    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double obterArea();

    @Override
    public String toString() {
       /**
        * retorna o nome e a discriao de ca forma. 
        */
        return String.format("%s: \n  Descrição: Forma geométrica genérica. \n  Area: %.2f", nome, obterArea());
    }
}
