/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ine5404.livremercado.model;

public class ItemCompra {

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
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }
    private Produto produto;
    private int quantidade;
    private Vendedor vendedor;
    
    
    public ItemCompra(Produto produto, Vendedor vendedor, int quantidade) throws IllegalArgumentException{
       if(produto == null || vendedor == null || quantidade < 0) {
           throw new IllegalArgumentException();
       }
       
       this.vendedor = vendedor;
       this.produto = produto;
       this.quantidade = quantidade;
       
    }
    
    public void adicioneQuantidade (int quantidade) {
        this.quantidade += quantidade;
    }
    
    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }
    
}
