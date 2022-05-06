/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author guilh
 */
public class Dinheiro implements Pagamento {

    private double valor;
    
    @Override
    public boolean pagar() {
        
        try{
            System.out.println("Pagamento realizado no dinheiro!");
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

    
    
}
