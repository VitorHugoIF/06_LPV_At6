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
public class BuyStock implements ITaskCommand {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }
    
    @Override
    public void execute() {
        this.stock.buy();
    }

    @Override
    public void cancel() {
        this.stock.sell();
    }
}
