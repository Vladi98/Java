/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyierarchy;

/**
 *
 * @author My Pc
 */
public class Shoes extends Item implements IShipment{

    private boolean canCheck;

    public Shoes(String shipmentAddress, double shipmentPricePerKg, int countOfElements, double weight, String name, boolean isBreakable) {
        super(shipmentAddress, shipmentPricePerKg, countOfElements, weight, name, isBreakable);
    }

 
    
    @Override
    public void AddElement(Element el) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double WeightOfItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ShowElements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double ShippingPrice() {
        if(!this.canCheck)
        return super.getShipmentPricePerKg()*super.getShipmentPricePerKg();
        else
        return  super.getShipmentPricePerKg()*super.getShipmentPricePerKg() -  super.getShipmentPricePerKg()*super.getShipmentPricePerKg()*0.03;
    }

    @Override
    public String toString() {
        return "Shoes{" + "canCheck=" + canCheck + '}';
    }
    
}
