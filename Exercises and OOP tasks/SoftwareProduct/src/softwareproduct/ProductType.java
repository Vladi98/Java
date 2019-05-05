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
public enum ProductType{

 DESKTOP(200),
 WEB(300),
 MOBILE(150);
 
 private double price;

    private ProductType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 
 
}
