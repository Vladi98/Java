/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyierarchy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My Pc
 */
public abstract class Item extends Element{
    private String shipmentAddress;
    private double shipmentPricePerKg;
    private int countOfElements;
    private List<Element> elements;

    public Item(String shipmentAddress, double shipmentPricePerKg, int countOfElements, double weight, String name, boolean isBreakable) {
        super(weight, name, isBreakable);
        this.shipmentAddress = shipmentAddress;
        this.shipmentPricePerKg = shipmentPricePerKg;
        this.countOfElements = countOfElements;
        this.elements = new ArrayList<Element>();
    }

   


    public abstract void AddElement(Element el);

    public abstract double WeightOfItem();
    
    public abstract void ShowElements();

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public double getShipmentPricePerKg() {
        return shipmentPricePerKg;
    }

    public int getCountOfElements() {
        return countOfElements;
    }

    public List<Element> getElements() {
        return elements;
    }
   
  
    
 
}
