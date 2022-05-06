/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author guilh
 */
public class Vestuario extends Produto {
    
    private String tamanho;
    
    Vestuario(String codigoProduto, String descricao, double preco, String tamanho)
    {
        super(codigoProduto, descricao, preco);
        
        setTamanho(tamanho);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
