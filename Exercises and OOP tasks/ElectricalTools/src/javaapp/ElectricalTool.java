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
public class ElectricalTool {
    private String manufacturer;
    private double price;
    private int guarantee;
    private boolean  willProvideExtendedGuarantee;

    public ElectricalTool(String manufacturer, double price, int guarantee,boolean willProvideExtendedGuarantee) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.guarantee = guarantee;
        this.willProvideExtendedGuarantee = willProvideExtendedGuarantee;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getGuarantee() {
        return guarantee;
    }


    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public boolean WillProvideExtendedGuarantee() {
        return willProvideExtendedGuarantee;
    }
    
    public String GuaranteePeriod(){
      if(this.willProvideExtendedGuarantee){
          this.guarantee+=12;
      }
      return ("Guarantee: "+this.guarantee);
    }

    @Override
    public String toString() {
        return "ElectricalTool{" + "manufacturer=" + manufacturer + ", price=" + price + ", guarantee=" + guarantee + ", willProvideExtendedGuarantee=" + willProvideExtendedGuarantee + '}';
    }

   
    
    
}
