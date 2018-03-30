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
public class Cliente {
    private String cpf;
    private String nome;
    private String estadoCivil;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Cliente() {
        endereco = new Endereco();
    }    

    public Cliente(String cpf, String nome, String estadoCivil, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String getEstadoCivil() {
        return estadoCivil;
    }

    private void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    private String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private Endereco getEndereco() {
        return endereco;
    }

    private void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
