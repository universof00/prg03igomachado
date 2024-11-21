/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

public class Contanobanco {
    private int numConta;
    private String tipo;
    private String cliente;
    private float saldo;
    private boolean status;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }
    
    public void setDepositar(float deposito){
        this.setSaldo(deposito);
    }
            
         /** Metodo para abrir uma conta */   
     public void abrirconta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        /** Verificando o tipo da conta */
        if (tipo.equals("cc")) {
            this.setSaldo(50);
        } else if (tipo.equals("cp")) {
            this.setSaldo(150);
        }

        System.out.println("Conta criada com sucesso!!");
    }
     /** Metodo para fechar a conta */
     public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta ainda tem dinheiro");
        }else if(this.getSaldo() < 0) {
            System.out.println("Você está devendo, caloteiro, pague o que nos deve!");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
     /** Metodo para depositar dinheiro em uma
      conta especifica*/
     public void depositar(float valor) {
        if (this.isStatus()) {
            this.setDepositar(valor);
            System.out.println("DEposito feito com sucesso!");
        } else {
            System.out.println("Conta fechada!");
        }
    }
     /** Metodo para sacar dinheiro */
     public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setDepositar(this.getSaldo() - valor);
                System.out.println("Saque feito com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta encerrada!");
        }
    }
     
     

}
