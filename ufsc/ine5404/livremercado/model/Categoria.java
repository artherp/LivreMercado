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
public class Categoria {

    /**
     * @return the produtos
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @return the subcategorias
     */
    public ArrayList<Categoria> getSubcategorias() {
        return subcategorias;
    }

    private String nome;
    private ArrayList<Produto> produtos;
    private ArrayList<Categoria> subcategorias;

    public Categoria(String nome) {
        this.nome = nome;
        produtos = new ArrayList<>();
        subcategorias = new ArrayList<>();
    }

    public void adicioneProduto(Produto produto) {
        if (!produtos.contains(produto)) {
            produtos.add(produto);
            if (!produto.getCategoria().equals(this)) {
                produto.setCategoria(this);
                produto.getCategoria().produtos.remove(produto);
            }
        }

    }

    public void adicioneSubcategoria(Categoria subcategoria) {
        if (!subcategorias.contains(subcategoria)) {
            subcategorias.add(subcategoria);
        }
    }

    public void removaSubcategoria(Categoria subcategoria, boolean permanente) throws IllegalArgumentException {
        if (permanente) {
            for (Produto produto : subcategoria.produtos) {
                produtos.add(produto);
                produto.setCategoria(this);
            }
            subcategoria.produtos.clear();
            for (Categoria subRem : subcategoria.subcategorias) {
                subcategorias.add(subRem);
            }
            subcategoria.subcategorias.clear();
        }
        subcategorias.remove(subcategoria);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
}
