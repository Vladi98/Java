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
public class PrivateShow extends Show{
   private static int minBasePrice =1;
   private double basePrice;
   private double pricePerhour;

    public PrivateShow(double basePrice, String place, TypeOfPlace type, double runTime) {
        super(place, type, runTime);
        this.basePrice = basePrice;
    }
    
   
   
    @Override
    public double showPrice() {
        double price =0;
        if(this.minBasePrice>this.pricePerhour)
        price = this.basePrice+(this.pricePerhour*super.getRunTime())+this.getType().getPrice();
       
        return price;
    }
    
    public boolean ComparePrivateShows(PrivateShow sh){
      if(this.pricePerhour>sh.pricePerhour){
          return true;
      }
      return false;
    }
    
    public void IncreaseMinPrice(int inc){
      this.minBasePrice+=inc;
    }
    
    public void DecreaseMinPrice(int dec){
     this.minBasePrice-=dec;
    }

    public static int getMinBasePrice() {
        return minBasePrice;
    }

    public static void setMinBasePrice(int minBasePrice) {
        PrivateShow.minBasePrice = minBasePrice;
    }

    @Override
    public String toString() {
        return "PrivateShow{" + "basePrice=" + basePrice + ", pricePerhour=" + pricePerhour + '}';
    }
    
    
}
