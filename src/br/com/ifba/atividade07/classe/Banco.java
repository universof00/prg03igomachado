/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.classe;

import javax.swing.JOptionPane;

/**
 *
 * @author igo
 */
public class Banco {
    
    private int numConta;
    protected String tipo; // cc ou cp
    private String senha;
    private String dono;
    private float saldo;
    private boolean status;

    
    public Banco() {
        this.saldo = 0;
        this.status = false;
        this.dono = null;
        this.tipo = null;
        this.senha = null;
        
    }

    private String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    private int getNumConta() {
        return numConta;
    }

    private void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String getDono() {
        return dono;
    }

    private void setDono(String dono) {
        this.dono = dono;
    }

    private float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    private boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }
    /**
     * Metodo para criar conta, passando o nome e o tipo da conta cc ou cp
     * Caso seja cc recebe R$ 50.00 e se for cp recebe R$ 150.00
     * @param dono
     * @param tipo 
     */
    public void abrirConta(String dono, String tipo, String senha){
        
        this.setDono(dono);
        this.setStatus(true);
        this.setTipo(tipo);
        this.setSenha(senha);
        
        
        if (tipo.equals("cc")) {
            this.setSaldo(50);
        } else if (tipo.equals("cp")) {
            this.setSaldo(150);
        }
        
        //System.out.println(this.getDono() + ", sua conta foi criada com sucesso!\n");
        JOptionPane.showMessageDialog(
            null, 
            this.getDono() + ", sua conta foi criada com sucesso!\nSaldo R$ ILIMITADO",
            "Conta Criada", 
            JOptionPane.INFORMATION_MESSAGE
        );

    }
    
    
    /**
     * Metodo para realizar um deposito, recebendo o deposito passado pelo usuário
     * @param deposito 
     */
    public void depositar(float deposito){
        /**
         *Testa para ver se a conta existe, caso exista, realiza o deposito
         * Do contrário, não, pois a conta esta encerrada ou ainda não foi criada
         */
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depoisito realizado com sucesso," + this.getDono() +  " " + this.getSaldo());
        }else{
            System.out.println("Impossível depositar em uma conta encerrada!\n");
        }
    }
    /**
     * Metodo de saque, realiza o saque somente se o usuário tem saldo suficiente
     * Caso não tenha, não realizará o saque
     * @param saque 
     */
    public void sacar(float saque){
        if(this.isStatus()){
            /**
             * Testa o saldo para ver tem será possível sacar
             */
            if(this.getSaldo() >= saque){
                this.setSaldo(this.getSaldo() - saque);
               // System.out.println("Saque de R$ " + saque + " realizado com sucesso");
                String mensagem = String.format("Saque de R$ %.2f realizado com sucesso!", saque);
                JOptionPane.showMessageDialog(null, mensagem); 
            }else{
                System.out.println("Saldo insuficiente!\n");
            }
            
        }else{
            System.out.println("Impossível sacar em uma conta encerrada!\n");
        }
    }
   
    /**
     * Metodo para pagar a mensalidade
     * Dependendo da conta, pagará mais caro
     * cc paga R$ 12.00
     * cp paga R$ 20.00
     */
    public void pagarMensalidade(){
         int valor = 0;
        if (this.getTipo().equals("cc")) {
            valor = 12;
        } else if (this.getTipo().equals("cp")) {
            valor = 20;
        }
        /**
         * Verifica se a conta existe
         */
        if (this.isStatus()) {
            /**
             * Verifica se tem saldo, caso tenha, realiza o saque, do contrário, não. 
             */
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para pagar a mensalidade\n");
            }
            
        } else {
            System.out.println("Impossível pagar mensalidade de uma conta fechada.");
        }
    }
    /**
     * Metodo para fechar a conta
     */
    public void fecharConta(){
        /**
         * verifica se a conta foi criada
         */
        if(this.isStatus()){
            /**
             * Verifica se tem saldo remanecente
             * Caso tenha, não será possível encerrar a conta
             */
            if(this.getSaldo() > 0){
                System.out.println("Conta não ser fechada por ter saudo na conta\n");
            }else{
                this.status = false;
                System.out.println("Conta encerrada com sucesso\n");
            }
        }else{
            System.out.println("Conta fechada!\n");
        }
    }
    
}
