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
public class WashingMachine extends ElectricalTool{
    private double maxOverTurnPerMin;
    private boolean hasDryingFunction;

    public WashingMachine(double maxOverTurnPerMin, boolean hasDryingFunction, String manufacturer, double price, int guarantee, boolean willProvideExtendedGuarantee) {
        super(manufacturer, price, guarantee, willProvideExtendedGuarantee);
        this.maxOverTurnPerMin = maxOverTurnPerMin;
        this.hasDryingFunction = hasDryingFunction;
    }

    
    
    
    public String GuaranteePeriod(){
          int guar =0;
      if(super.WillProvideExtendedGuarantee()){
         guar = super.getGuarantee()+12;
      }
      else {
           guar = super.getGuarantee();
      }
      
      if(this.hasDryingFunction){
        guar+= guar/2;
      }
      
      return "Guarantee: "+guar;
    }

    @Override
    public String toString() {
        return super.toString() + "WashingMachine{" + "maxOverTurnPerMin=" + maxOverTurnPerMin + ", hasDryingFunction=" + hasDryingFunction + "Guarantee Period "+this.GuaranteePeriod()+ '}';
    }
  
    
}