/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.List;

/**
 *
 * @author guilh
 */
public class Loja {
    private String nome;
    private String cnpj;
    
    private List<Compra> historicoCompras;
    
    Loja(String nome,String cnpj)
    {
        setNome(nome);
        setCnpj(cnpj);
    }
    
    protected void setNome(String nome)
    {
        this.nome = nome;
    }
    
    protected void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
    
    protected void addToHistory(Compra compra)
    {
        historicoCompras.add(compra);
    }
    
    protected List<Compra> getHistory()
    {
        return this.historicoCompras;
    }
    
    protected String getNome()
    {
        return this.nome;
    }
    
    protected String getCnpj()
    {
        return this.nome;
    }
}
