/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at6.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class BrokerTest {
    
    @Test
    public void testBuyStock() {
        Broker broker = new Broker();
        Stock stock = new Stock("Ação Magazine Luiza", 20);

        ITaskCommand buyStock = new BuyStock(stock);
        broker.executeTask(buyStock);
        
        assertEquals("Compra de 20 unidades de Ação Magazine Luiza" , stock.getSituation());
    }
    
    @Test
    public void testSellStock() {
        Broker broker = new Broker();
        Stock stock = new Stock("Ação Magazine Luiza", 20);
        
        ITaskCommand sellStock = new SellStock(stock);
        broker.executeTask(sellStock);
        
        assertEquals("Venda de 20 unidades de Ação Magazine Luiza" , stock.getSituation());
    }
    
    @Test
    public void testCancelSale() {
        Broker broker = new Broker();
        Stock stock = new Stock("Ação Magazine Luiza", 20);
        
        ITaskCommand buyStock = new BuyStock(stock);
        ITaskCommand sellStock = new SellStock(stock);
        
        broker.executeTask(buyStock);
        broker.executeTask(sellStock);
        
        broker.cancelLastTask();
        
        assertEquals("Compra de 20 unidades de Ação Magazine Luiza" , stock.getSituation());
    }
}
