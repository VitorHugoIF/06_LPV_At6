/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at6.command;

/**
 *
 * @author vitor.marcelino
 */
public class Stock {
    private String name;
    private int amount;
    
    private String situation;
    
    public Stock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getSituation() {
        return situation;
    }
    
    public void buy(){
      this.situation = "Compra de " + amount + " unidades de " + name;
    }
    public void sell(){
      this.situation = "Venda de " + amount + " unidades de " + name;
    }
}
