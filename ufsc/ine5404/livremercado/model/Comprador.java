/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ine5404.livremercado.model;

/**
 *
 * @author arthe
 */
public class Comprador extends Pessoa {
    private Carrinho carrinho;
    
    public Comprador(String nome) {
        super(nome);
        carrinho = new Carrinho();
}
    
    public void adicioneAoCarrinho(Produto produto, Vendedor vendedor, int quantidade) {
        carrinho.adicioneItem(produto, vendedor, quantidade);
    }
    
    public void efetuarCompra() {
        for (ItemCompra item : carrinho.getItens()) {
            Produto produto = item.getProduto();
            Vendedor vendedor = item.getVendedor();
            int quantidade = item.getQuantidade();
            
            try {
                vendedor.getEstoque().reduzaQuantidade(produto, quantidade);
                item.setQuantidade(0);
            } catch (IllegalArgumentException e) {}
            
        }
        
        for(ItemCompra itensRemover : carrinho.getItens()) {
            if(itensRemover.getQuantidade() == 0) {
                carrinho.removaItem(itensRemover.getProduto());
            }
        }
        
    }
     

    /**
     * @return the carrinho
     */
    public Carrinho getCarrinho() {
        return carrinho;
    }
    
    
}
