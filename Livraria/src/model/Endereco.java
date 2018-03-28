/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alunoces
 */
public class Endereco {
    private String logradouro;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String logradouro, String complemento, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    Endereco() {
        
    }

    private String getLogradouro() {
        return logradouro;
    }

    private void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    private String getComplemento() {
        return complemento;
    }

    private void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    private String getCidade() {
        return cidade;
    }

    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    private String getCep() {
        return cep;
    }

    private void setCep(String cep) {
        this.cep = cep;
    }
}
