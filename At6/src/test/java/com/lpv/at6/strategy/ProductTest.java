/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at6.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author vitor.marcelino
 */
public class ProductTest {
    
    @Test
    public void testGetICMSValue() {
        double value = 100.00;
        Product product = new Product(value);
        product.calculateICMS(product.getValue());
        double result = value * 0.10;
        assertEquals(result, product.getValue());
    }
    
    @Test
    public void testGetIPIValue() {
        double value = 100.00;
        Product product = new Product(value);
        product.calculateIPI(product.getValue());
        double result = value * 0.20;
        assertEquals(result, product.getValue());
    }
    
    @Test
    public void testSumICMS_IPI() {
        double value = 100.00;
        Product product = new Product(value);
        product.sumICMS_IPI(product.getValue());
        
        double result = (value * 0.10) + (value * 0.20);
        
        assertEquals(result, product.getValue());
    }
}
