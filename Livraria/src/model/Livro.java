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
public class Livro {
    private String codigo;
    private String titulo;
    private String fornecedor;
    private String quantidadeEstoque;
    private String valorUnitario;
    private String data;

    public Livro() {
    }

    public Livro(String codigo, String titulo, String fornecedor, String quantidadeEstoque, String valorUnitario, String data) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fornecedor = fornecedor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String toString(){
        return "Código: " + codigo + "\nTítulo: " + titulo + "\nFornecedor: " + fornecedor
        + "\nQuantidade em estoque: " + quantidadeEstoque + "\nValor unitário: " + valorUnitario
        + "\nData de publicação: " + data + "\n";
    }
    
    public boolean validaLivro(){
        return !codigo.equals("") &&
               !titulo.equals("") &&
               !quantidadeEstoque.equals("") &&
               !valorUnitario.equals("") &&
               !data.equals("  /  /    ") &&
               !fornecedor.equals("");
    }
}
