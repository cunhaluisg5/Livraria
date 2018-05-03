/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Venda;

/**
 *
 * @author Luís Gustavo
 */
public class VendaDao {
    private List<Venda> lista = null;

    public VendaDao() {
        lista = new ArrayList<Venda>();
    }
    
    public void adicionarVenda(Venda venda){
        lista.add(venda);
    }
    
    public Venda buscarVenda(int numero){
        Venda v = null;
        for(Venda venda : lista){
            if(venda.getNumero() == numero){
                v = venda;
            }
        }
        return v;
    }
    
    public void removerVenda(int numero){
        Venda venda = buscarVenda(numero);
        if(venda != null){
            lista.remove(venda);
        }
    }
    
    public void alterarVenda(int numero){
        Venda venda = buscarVenda(numero);
        if(venda != null){
            int idx = lista.indexOf(venda);
            lista.set(idx, venda);
        }
    }
    
    public List<Venda> todosVendas(){
        return lista;
    }
}
