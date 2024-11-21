/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade03.view;
/**
 *
 * @author oxede
 */
import java.time.LocalDate;

public class Calculadora extends javax.swing.JFrame {
    /** Iniciando o construtos com o ano atual */
    public Calculadora() {
        initComponents();
        LocalDate dataAtual = LocalDate.now();
        spnanoescolhido.setValue(dataAtual.getYear());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        btnCalcularIdade = new javax.swing.JButton();
        lblIdade = new javax.swing.JLabel();
        lblIdadeMostrada = new javax.swing.JLabel();
        lbliconeperfil = new javax.swing.JLabel();
        spnanoescolhido = new javax.swing.JSpinner();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNascimento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblNascimento.setText("Ano de Nascimento");
        getContentPane().add(lblNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 33, 186, 40));

        btnCalcularIdade.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCalcularIdade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/atividade03/imagens/calculadoraicone.png"))); // NOI18N
        btnCalcularIdade.setText("Calcular");
        btnCalcularIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 103, -1, -1));

        lblIdade.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblIdade.setText("Idade:");
        getContentPane().add(lblIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 199, 116, -1));

        lblIdadeMostrada.setFont(new java.awt.Font("Segoe UI", 0, 37)); // NOI18N
        lblIdadeMostrada.setForeground(new java.awt.Color(255, 0, 0));
        lblIdadeMostrada.setText("............");
        getContentPane().add(lblIdadeMostrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 198, 124, -1));

        lbliconeperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/atividade03/imagens/perfilicon.png"))); // NOI18N
        getContentPane().add(lbliconeperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 200, 210));

        spnanoescolhido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(spnanoescolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /** Metodo para calcaular a data de nascimento */
    private void btnCalcularIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIdadeActionPerformed
        LocalDate dataAtual = LocalDate.now();    
        int resultado = dataAtual.getYear() - (Integer) spnanoescolhido.getValue();
        if(resultado < 0){
            lblIdadeMostrada.setText("0");
        }else{
            lblIdadeMostrada.setText(Integer.toString(resultado));
        }
    }//GEN-LAST:event_btnCalcularIdadeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularIdade;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblIdadeMostrada;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lbliconeperfil;
    private javax.swing.JSpinner spnanoescolhido;
    // End of variables declaration//GEN-END:variables
}
