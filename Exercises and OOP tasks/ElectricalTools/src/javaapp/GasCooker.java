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
public class GasCooker extends ElectricalTool {

    public GasCooker(String manufacturer, double price, int guarantee, boolean willProvideExtendedGuarantee) {
        super(manufacturer, price, guarantee, willProvideExtendedGuarantee);
    }
    

    
     public String GuaranteePeriod(){
          int guar =0;
      if(super.WillProvideExtendedGuarantee()){
           guar = super.getGuarantee()+12*2;
      }
      else {
           guar = super.getGuarantee()+12;
      }
      
      return "Guaranatee: "+guar;
    }

    @Override
    public String toString() {
        return super .toString() +"GasCooker{" + " Guarantee period "+ this.GuaranteePeriod()+'}' ;
    }
     
     
}
