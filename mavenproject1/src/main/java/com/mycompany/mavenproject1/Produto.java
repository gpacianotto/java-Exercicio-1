/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author guilh
 */
public abstract class Produto {
    private String codigoProduto;
    private String descricao;
    private double precoUnitario;

    Produto(String codigoProduto, String descricao, double preco)
    {
        setCodigoProduto(codigoProduto);
        setDescricao(descricao);
        setPrecoUnitario(precoUnitario);
    }
    
    public String getDescricao() {
        return descricao;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    
            
    
}
