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
public class PagamentoCartao implements Pagamento {
     private double valor;
     /**
      * taxa do cartão já inicializada com 5%
      */
     private double taxaDoCartao = 0.05;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxaDoCartao() {
        return taxaDoCartao;
    }

    public void setTaxaDoCartao(double taxaDoCartao) {
        this.taxaDoCartao = taxaDoCartao;
    }
    
    
    /**
     * Calcula o total juntamente com a taxa de 5%
     * @return 
     */
    @Override
    public double calcularTotal() {
        /**
         * calculando o total junto com a taxa
         */
        double total = getValor() + getTaxaDoCartao();
         return total;
    }
      /**
     * Exibe um recibo do pagamento com detalhes do valor, taxa e total.
     * Utiliza uma janela de diálogo (JOptionPane) para exibir as informações.
     */
    @Override
    public void ImprimirRecibo() {
        double taxinhaDoAmor = getValor() * 0.98;
        String recibo = """
                        Pagamento realizado com cart\u00e3o.
                        Valor: R$ """ + String.format("%.2f", valor) + "\n" +
            "Taxa: R$ " + String.format("%.2f", getValor() * getTaxaDoCartao()) + "\n" +
            "Taxa do Amor: R$ " + String.format("%.2f", taxinhaDoAmor) + "\n" +
            "Total: R$ " + String.format("%.2f", calcularTotal() + taxinhaDoAmor);

    JOptionPane.showMessageDialog(null, recibo, "Recibo - Cartão", JOptionPane.INFORMATION_MESSAGE);
    }     
}
