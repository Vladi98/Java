/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author My Pc
 */
public class ElectricalCooker extends ElectricalTool{

    public ElectricalCooker(String manufacturer, double price, int guarantee, boolean willProvideExtendedGuarantee) {
        super(manufacturer, price, guarantee, willProvideExtendedGuarantee);
    }
    
  
    
      public String GuaranteePeriod(){
          int guar =0;
      if(super.WillProvideExtendedGuarantee()){
           guar = super.getGuarantee()+12;
      }
      else {
           guar = super.getGuarantee();
      }
      
      return "Guarantee: "+guar;
    }

    @Override
    public String toString() {
        return super.toString() + "ElectricalCooker {" + " Guarantee Perdiod "+ this.GuaranteePeriod()+'}';
    }
    
    
}
 