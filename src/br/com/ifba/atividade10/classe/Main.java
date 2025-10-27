/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author igo
 */
public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[] {
            new Circulo(3),
            new Quadrado(45),
            new Triangulo(5, 2),
            new Esfera(15),
            new Cubo(78),
            new Piramide(4, 6)
        };

        for (Forma f : formas) {
            System.out.println(f.toString());

            if (f instanceof Forma2d) {
                System.out.println("Área: " + ((Forma2d) f).obterArea());
            } else if (f instanceof Forma3d) {
                System.out.println("Área: " + ((Forma3d) f).obterArea());
                System.out.println("Volume: " + ((Forma3d) f).obterVolume());
            }

            System.out.println("--------------------------");
        }
    }
}
