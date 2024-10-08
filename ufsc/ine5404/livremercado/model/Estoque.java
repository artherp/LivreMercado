/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ine5404.livremercado.model;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemEstoque> itens; 

    public Estoque() {
        itens = new ArrayList<>();
    }
    
    public void adicioneItem(Produto produto, int quantidade) {
           for (ItemEstoque item : itens) {
               if(item.getProduto().equals(produto)) {
                   item.adicioneQuantidade(quantidade);
                   return;
               }
           }
           itens.add(new ItemEstoque(produto, quantidade));
        }
        
    
    
        public ArrayList<ItemEstoque> getItens() {
        return itens;
    }
    
    public int quantidadeEmEstoque(Produto produto) {
       for (ItemEstoque item : itens) {
           if(item.getProduto().equals(produto)) {
               return item.getQuantidade();
           }
       }
       return 0;
    }
    
    public void reduzaQuantidade(Produto produto, int quantidade) throws IllegalArgumentException{
            for (ItemEstoque item : itens) {
                if(item.getProduto().equals(produto)) {
                    if(quantidade > item.getQuantidade()) {
                        throw new IllegalArgumentException();
                    }
                    item.removaQuantidade(quantidade);
                }
            }
        }
    }

    
    

    
    

