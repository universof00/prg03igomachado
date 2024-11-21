/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

import java.util.Set;

/**
 *
 * @author oxede
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", paginaAtual=" + paginaAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() +
                '}';
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    @Override
    public void abrir(){
        this.aberto = true;
    }
    
    @Override
    public void fechar(){
        this.aberto = false;
    }
    
    @Override
    public void folhear(int pagina){
        if(pagina > this.getTotalPaginas() || pagina < 0){
            System.out.println("Pagina nao encontrada!");
        }else{
            this.setPaginaAtual(pagina);  
        }
    }
    
    @Override
    public void avancarPagina(){
        if(this.getPaginaAtual() < this.getTotalPaginas()){
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        }
    }
    
    @Override
    public void voltarPagina(){
        if(this.getPaginaAtual() > 0){
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        }
    }
}
