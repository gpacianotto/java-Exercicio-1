/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author guilh
 */
public class Cartao implements Pagamento {
    
    
    private double valor;
    private String codTransacao;
    
    Cartao(double valor)
    {
        setValor(valor);
    }
    
    @Override
    public boolean pagar() {
        try{
            setCodTransacao("teste12314123");
            //professor, e se eu quisesse definir o codigo da transação
            // usando parametros em pagar(); tem como ?
            System.out.println("Pagamento realizado no cartão!");
            System.out.println("Id da transação: "+codTransacao);
            System.out.println("Valor: "+ valor);
            return true;
        }
        catch (Exception e){
            System.out.println("Erro!");
            return false;
        }
    }

    public double getValor() {
        return valor;
    }
    
    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodTransacao() {
        return codTransacao;
    }

    public void setCodTransacao(String codTransacao) {
        this.codTransacao = codTransacao;
    }

    
    
}
