/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

public class Fatorial {
     private int n;
     private int fat = 1;
     private String formula = "";

    public void setValor(int n) {
        int num = n;
        int f = 1;
        String s = "";
        for(int i = n; i > 1; i--){
            f*= i;
            s += i + "x"; 
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }

    public int getFatorial() {
         return fat;
    }

    public String getFormula() {
        return formula;
    }
}
