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
public class Furniture extends Item implements IShipment{
    
    private String brand;
    

    public Furniture(String shipmentAddress, double shipmentPricePerKg, int countOfElements, double weight, String name, boolean isBreakable) {
        super(shipmentAddress, shipmentPricePerKg, countOfElements, weight, name, isBreakable);
    }

  
    
     public double WeightOfItem(){
        double sum =0;
     for(Element el: super.getElements()){
       sum+= el.getWeight();
     }
     return sum;
    }

    public void ShowElements(){
      
        for(Element el : super.getElements()){
          System.out.println(el.toString());
        }
    }

    @Override
    public void AddElement(Element el) {
        super.getElements().add(el);
    }

    public boolean CheckIfIsBreakable(){
       boolean canBreak = false;
      for(Element el : super.getElements()){
        if (el.IsItBreakable()==true){
          canBreak = true;
          break;
        }
      }
      return canBreak;
      
    }
    @Override
    public double ShippingPrice() {
       if(this.CheckIfIsBreakable()){
           return super.getCountOfElements()*super.getShipmentPricePerKg() -((super.getCountOfElements()*super.getShipmentPricePerKg())*1.5)/100;
       }
       else return super.getCountOfElements()*super.getShipmentPricePerKg();
    }

 

  

 

   
}
