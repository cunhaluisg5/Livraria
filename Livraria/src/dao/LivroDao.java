/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

/**
 *
 * @author Luís Gustavo
 */
public class LivroDao {
    private List<Livro> lista = null;

    public LivroDao() {
        lista = new ArrayList<Livro>();
    }
    
    public void adicionarLivro(Livro livro){
        lista.add(livro);
    }
    
    public Livro buscarLivro(String codigo){
        Livro li = null;
        for(int i = 0; i < lista.size(); i++){
            if(codigo.equals(lista.get(i).getCodigo())){
                li = lista.get(i);
            }
        }
        return li;
    }
    
    public void removerLivro(String codigo){
        Livro li = buscarLivro(codigo);
        if(li != null){
            lista.remove(li);
        }
    }
    
    public void alterarLivro(Livro livro){
        Livro li = buscarLivro(livro.getCodigo());
        if(li != null){
            int idx = lista.indexOf(li);
            lista.set(idx, li);
        }
    }
    
    public List<Livro> todosLivros(){
        return lista;
    }
}
