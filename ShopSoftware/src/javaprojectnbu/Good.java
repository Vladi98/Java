/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectnbu;

/**
 *
 * @author My Pc
 */
public class Good {
    private String name;
    private int Id;
    private double price;
    private String expirationDate;

    public Good(String name, int Id, double price, String expirationDate) {
        this.name = name;
        this.Id = Id;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public double getPrice() {
        return price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Good{" + "name=" + name + ", Id=" + Id + ", price=" + price + ", expirationDate=" + expirationDate + '}';
    }
    
    
}
