/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luís Gustavo
 */
public class Usuario {
    private String nome;
    private String matricula;
    private String senha;

    public Usuario() {
        this.nome = "Admin";
        this.matricula = "AC2018";
        this.senha = "s1234";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean validarSenha(String senha){
        if(senha.length() == 5 && !senha.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean validarMatricula(String matricula){
        if(matricula.length() == 6){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean efetuarOLogin(String matricula, String senha){
        if(matricula.toUpperCase().equals(this.matricula.toUpperCase()) && senha.toUpperCase().equals(this.senha.toUpperCase())){
            return true;
        }
        else{
            return false;
        }
    }
}
