/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade04.view;

public class Genio extends javax.swing.JFrame {

    public Genio() {
        initComponents();
        lblbalaogenio.setText("<html>Vou pensar em um valor entre 1 e 5, tente advinhar!<html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnvalor = new javax.swing.JSpinner();
        lblvalor = new javax.swing.JLabel();
        bntpalpite = new javax.swing.JButton();
        lblbalaogenio = new javax.swing.JLabel();
        lblbalao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnvalor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        spnvalor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(spnvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 229, 90, 35));

        lblvalor.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblvalor.setText("Valor:");
        getContentPane().add(lblvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 232, 62, -1));

        bntpalpite.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        bntpalpite.setText("Palpite");
        bntpalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntpalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(bntpalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 282, 110, 52));

        lblbalaogenio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblbalaogenio.setText("De 1 a 5, tente adivinhar");
        getContentPane().add(lblbalaogenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 260, 150));

        lblbalao.setIcon(new javax.swing.ImageIcon("C:\\Users\\oxede\\Documents\\NetBeansProjects\\atividade\\src\\main\\java\\br\\com\\ifba\\atividade04\\imagens\\genio.png")); // NOI18N
        lblbalao.setText("jLabel1");
        getContentPane().add(lblbalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 292, 324));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntpalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntpalpiteActionPerformed
        int numgenio = (int) (Math.random() * 5) + 1;
        int numusuario = Integer.parseInt(spnvalor.getValue().toString());
        
       lblbalaogenio.setText(numgenio == numusuario ? "Acertou" : "Errou, eu pensei no " + numgenio);  
    }//GEN-LAST:event_bntpalpiteActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Genio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntpalpite;
    private javax.swing.JLabel lblbalao;
    private javax.swing.JLabel lblbalaogenio;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JSpinner spnvalor;
    // End of variables declaration//GEN-END:variables
}
