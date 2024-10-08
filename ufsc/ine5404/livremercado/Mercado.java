package ufsc.ine5404.livremercado;

import java.util.ArrayList;
import ufsc.ine5404.livremercado.model.Categoria;
import ufsc.ine5404.livremercado.model.Comprador;
import ufsc.ine5404.livremercado.model.Vendedor;

public class Mercado {

    /**
     * @return the categorias
     */
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    /**
     * @return the compradores
     */
    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    /**
     * @return the vendedores
     */
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
        private ArrayList<Categoria> categorias;
        private ArrayList<Comprador> compradores;
        private ArrayList<Vendedor> vendedores;
        
        public Mercado() {
            categorias = new ArrayList<>();
            compradores = new ArrayList<>();
            vendedores = new ArrayList<>();
        }
        
        public void adicioneCategoria(Categoria categoria) {
            if(!categorias.contains(categoria)) {
                categorias.add(categoria);
            }
        }
        
        public void adicioneComprador(Comprador comprador) {
            if(!compradores.contains(comprador)) {
                compradores.add(comprador);
            }
        }
        
        public void adicioneVendedor(Vendedor vendedor) {
            if(!vendedores.contains(vendedor)) {
                vendedores.add(vendedor);
            }
        }
    
}
