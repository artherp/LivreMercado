/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ine5404.livremercado.model;

/**
 *
 * @author arthe
 */
public class ItemEstoque {

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    private Produto produto;
    private int quantidade;
    
    public ItemEstoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public void adicioneQuantidade(int quantidade) {
        if(quantidade > 0) {
            this.quantidade += quantidade;
        }
    }
    
    public void removaQuantidade(int quantidade) {
        if(quantidade > 0) {
            this.quantidade -= quantidade; // tinha q verificar para a quantidade nao ficar negativa
        }  
    }  
}
