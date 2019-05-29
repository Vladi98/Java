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
public class Cashier {
    private String name;
    private String Id;

    public Cashier(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Cashier{" + "name=" + name + ", Id=" + Id + '}';
    }
    
    
}
