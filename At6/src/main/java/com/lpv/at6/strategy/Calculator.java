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
public class Calculator {
    
    private double value;

    public Calculator(double value) {
        this.value = value;
    }
    
    public double calculate (ITaxStrategy tax) {
        return tax.calculate(value);
    }  
}
