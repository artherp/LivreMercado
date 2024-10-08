/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ine5404.livremercado.model;

import java.util.ArrayList;

/**
 *
 * @author arthe
 */
public class Carrinho {
    private ArrayList<ItemCompra> itens;
    
    public Carrinho() {
        itens = new ArrayList<>();
    }
    
    public void adicioneItem(Produto produto, Vendedor vendedor, int quantidade) throws IllegalArgumentException {
        Estoque estoque = vendedor.getEstoque();
        int quantidadeProduto = estoque.quantidadeEmEstoque(produto);
        
        if(quantidade > quantidadeProduto) {
            throw new IllegalArgumentException();
        }
        
        for(ItemCompra item : itens) {
            if(item.getProduto().equals(produto) && item.getVendedor().equals(vendedor)) {
                int novaQuantidade = item.getQuantidade() + quantidade;
                if(novaQuantidade > quantidadeProduto) {
                    throw new IllegalArgumentException();
                }
                item.adicioneQuantidade(quantidade);
                return;
            }
        }
        itens.add(new ItemCompra(produto, vendedor, quantidade));
    }

    /**
     * @return the itens
     */
    public ArrayList<ItemCompra> getItens() {
        return itens;
    }
    
    public void removaItem(Produto produto) {
       for(ItemCompra item : itens) {
           if(item.getProduto().equals(produto)) {
               itens.remove(item);
               return;
           }
       }
    }
    
}
