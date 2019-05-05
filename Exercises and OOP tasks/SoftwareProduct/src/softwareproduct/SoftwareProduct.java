/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproduct;

/**
 *
 * @author My Pc
 */


public class SoftwareProduct {
    private String name;
    private double price;
    private ProductType pr;

    public SoftwareProduct(String name, double price, ProductType pr) {
        this.name = name;
        this.price = price;
        this.pr = pr;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getPr() {
        return pr;
    }
    
    
}
