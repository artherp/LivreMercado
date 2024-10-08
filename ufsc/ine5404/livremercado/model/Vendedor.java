/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ine5404.livremercado.model;

/**
 *
 * @author arthe
 */
public class Vendedor extends Pessoa{
    private Estoque estoque;
    
    public Vendedor(String nome) {
        super(nome);
        estoque = new Estoque();
    }
    
    public void adicioneProdutoAoEstoque(Produto produto, int quantidade) {
        estoque.adicioneItem(produto, quantidade);
    }

    /**
     * @return the estoque
     */
    public Estoque getEstoque() {
        return estoque;
    }
    
    
    
}
