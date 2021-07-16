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
public class ICMS implements ITaxStrategy{
    @Override 
    public double calculate(double value) { 
      return value * 0.10; 
    } 
}
