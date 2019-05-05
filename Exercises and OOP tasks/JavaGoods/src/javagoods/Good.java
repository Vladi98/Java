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
public abstract class Good {
    private double overcharge;

    public Good(double overcharge) {
        this.overcharge = overcharge;
    }
   
    public double salePrice(){
      return this.totalPrice()+ (this.totalPrice()*this.overcharge/100);
    }
    public abstract double totalPrice();

    @Override
    public String toString() {
        return "Good{" + "overcharge=" + overcharge + '}';
    }

}
