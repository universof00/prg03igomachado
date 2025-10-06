 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba;

import br.com.ifba.atividade06.view.Fatorial;

/**
 *
 * @author igo
 */
public class Prg03igomachado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Olá, Mundo!");
        
        Fatorial fatorial = new Fatorial();
        
        fatorial.setValor(500);
        System.out.println(fatorial.getFatorial());
        System.out.println(fatorial.getFormula());
    }
    
}
