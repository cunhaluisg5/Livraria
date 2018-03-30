/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author Luís Gustavo
 */
public class ClienteDao {
    private List<Cliente> lista = null;

    public ClienteDao() {
        lista = new ArrayList<Cliente>();
    }
    
    public void adicionarCliente(Cliente cliente){
        lista.add(cliente);
    }
    
    public Cliente buscarCliente(String cpf){
        Cliente cli = null;
        for(int i = 0; i < lista.size(); i++){
            if(cpf.equals(lista.get(i).getCpf())){
                cli = lista.get(i);
            }
        }
        return cli;
    }
    
    public void removerCliente(String cpf){
        lista.remove(buscarCliente(cpf));
    }
    
    public void alterarCliente(Cliente cliente){
        Cliente cli = buscarCliente(cliente.getCpf());
        int indice = lista.indexOf(cli);
        lista.set(indice, cli);
    }
    
    public List todosClientes(){
        return lista;
    }
}
