/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band;

/**
 *
 * @author My Pc
 */
public enum TypeOfPlace {
    OUTDOOR(10),
    INDOOR(5),;
    
    private int price;

    private TypeOfPlace(int continuing) {
        this.price = continuing;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int continuing) {
        this.price = continuing;
    }
    
    
}
