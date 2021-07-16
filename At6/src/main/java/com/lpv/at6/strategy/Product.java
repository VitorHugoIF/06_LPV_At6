/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at6.strategy;

/**
 *
 * @author vitor.marcelino
 */
public class Product {
    private double value;

    public Product(double value) {
        this.value = value;
    }
    
    public double getValue() {
        return this.value;
    }
    
    public void calculateICMS(double value) {
        Calculator calculator = new Calculator(value);
        this.value = calculator.calculate(new ICMS());
    }
    
    public void calculateIPI(double value) {
        Calculator calculator = new Calculator(value);
        this.value = calculator.calculate(new IPI());
    }
    
    public void sumICMS_IPI(double value) {
        Calculator calculator = new Calculator(value);
        double icms = calculator.calculate(new ICMS());
        double ipi = calculator.calculate(new IPI());
        
        this.value = icms + ipi;
    }
}
