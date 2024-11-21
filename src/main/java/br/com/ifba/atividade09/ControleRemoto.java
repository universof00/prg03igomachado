/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;
/**
 *
 * @author oxede
 */

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.volume = 35;
        this.tocando = false;
        this.ligado = false;
    }
    
    
    /** Get e set privados */
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu(){
        if(this.isLigado()){
            System.out.println("Menu do controle");
        }else{
            System.out.println("A tv está deslidaga!");
        }
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("O menu foi fechado!");
    }
    
    @Override
    public void maisVolume() {
       if(this.isLigado()){
           this.setVolume(this.getVolume() + 100);
       }else{
           System.out.println("Controle desligado");
       } 
    }
    
    @Override
    public void menosVolume() {
       if(this.isLigado()){
           this.setVolume(this.getVolume() - 100);
       }else{
           System.out.println("Controle desligado");
       } 
    }
    
    @Override
    public void ligarMudo(){
       if(this.isLigado() && this.getVolume() > 0){
           this.setVolume(0);
       } 
    }
   
    @Override
    public void desligarMudo(){
        if(this.isLigado() && this.getVolume() == 0){
           this.setVolume(1000);
       }
    }
    
    public void play(){
        if(this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }else{
            System.out.println("Não foi possível reproduzir");
        }
    }
    
    @Override
    public void pause(){
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não foi possível pausar");
        }
    }
}
