 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba;

import br.com.ifba.atividade06.view.Fatorial;
import br.com.ifba.atividade07.classe.Banco;

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
        
        /*Fatorial fatorial = new Fatorial();
        
        fatorial.setValor(500);
        System.out.println(fatorial.getFatorial());
        System.out.println(fatorial.getFormula());*/
        
        Banco novaConta = new Banco();
        novaConta.abrirConta("Igo Machado", "cp",  "123");
        novaConta.depositar(500);
        novaConta.pagarMensalidade();
        novaConta.sacar(100);
    }
    
}
