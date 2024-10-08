/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ine5404.livremercado.model;

public class Produto {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    private String nome;
    private String modelo;
    private String marca;
    private double preco;
    private Categoria categoria;
    
    public Produto(String nome, String modelo, String marca, double preco, Categoria categoria) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.categoria = categoria;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
}
