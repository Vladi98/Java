/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagoods;

/**
 *
 * @author My Pc
 */
public class Painting extends Good {

    private double priceOfOnePaint;
    private double countOfPaints;

    public Painting(double priceOfOnePaint, double countOfPaints, double overcharge) {
        super(overcharge);
        this.priceOfOnePaint = priceOfOnePaint;
        this.countOfPaints = countOfPaints;
    }

   
    @Override
    public double totalPrice() {
        return this.priceOfOnePaint*this.countOfPaints;
    }
    
}
