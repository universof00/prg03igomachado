/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.classe;

import javax.swing.JOptionPane;

/**
 *
 * @author igo
 */
public class PagamentoPix implements Pagamento {
    private double valor;
    private double dinheiroCash = 0.02;
    
    /**
     * Construtor recebe o valor e adiciona na variavél valor.
     * @param valor 
     */
    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDinheiroCash() {
        return dinheiroCash;
    }

    public void setDinheiroCash(double dinheiroCash) {
        this.dinheiroCash = dinheiroCash;
    }
    
    
     /**
     * Retorna o valor total pago via Pix.
     * Nenhuma taxa ou desconto é aplicado.
     */
    @Override
    public double calcularTotal() {
        return this.valor; 
    }
    
    /**
     * Exibe um recibo do pagamento via Pix, incluindo valor original e cashback oferecido.
     * Utiliza uma janela de diálogo (JOptionPane) para mostrar as informações.
     */
    
    @Override
    public void ImprimirRecibo() {
        double cashBack = getValor() * getDinheiroCash();
       
         
        String recibo = """
                        Pagamento realizado via Pix.
                        Total: R$ """ + String.format("%.2f", getValor()) + "\n" +
                        "Cashback (2%): R$ " + String.format("%.2f", cashBack) + "\n";

        JOptionPane.showMessageDialog(null, recibo, "Recibo - Pix com Cashback", JOptionPane.INFORMATION_MESSAGE);
    }
}
