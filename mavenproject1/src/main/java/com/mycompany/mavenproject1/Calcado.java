/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author guilh
 */
public class Calcado extends Produto {
    
    private int tamanho;
    
    Calcado(String codigoProduto, String descricao, double preco, int tamanho)
    {
        super(codigoProduto, descricao, preco);
        
        setTamanho(tamanho);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}
