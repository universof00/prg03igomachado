/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author oxede
 */
public class Testendoocodigo {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Igo Machado", 25, "M");
        Livro l1 = new Livro("Aprendendo C", "Machado Igo", 9000000, p1);

        l1.abrir();
        l1.folhear(10000);
        l1.avancarPagina();
        System.out.println(l1.detalhes());
    }
}
