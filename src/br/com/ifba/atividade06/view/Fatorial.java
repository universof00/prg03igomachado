/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author igo
 */
public class Fatorial {
    int fatorial; 
    String formula; 
    
    public void setValor(int valor){
        this.fatorial = valor;
    }
    
    public int getFatorial(){
        int resultado = 1;
        StringBuilder colaFormula = new StringBuilder();
        
        for(int i = fatorial; i > 1; i--){
            resultado = resultado * i;
            colaFormula.append(i).append(" x ");
        }
        resultado = resultado * 1;
        colaFormula.append("1 = ").append(resultado);
        formula = colaFormula.toString();
        return resultado;
    }
    
    public String getFormula(){
       return formula;
    }
}
