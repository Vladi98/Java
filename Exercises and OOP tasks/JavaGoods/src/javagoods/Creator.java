/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagoods;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My Pc
 */
public class Creator implements IProvider{

    public List<Good> goods;

    public Creator() {
        this.goods = new ArrayList<Good>();
    }
    
  
    
    public void DisplayGoods(){
      
        for(Good item: goods){
          System.out.println(this.toString());
          System.out.println(item.salePrice());
          System.out.println(item.totalPrice());
        }
    }

    @Override
    public double TotalEarnings() {
        double sum =0;
       for(Good item:goods){
           sum+=item.salePrice();
       }
       return sum;
    }

    @Override
    public String toString() {
        return "Creator{" + "goods=" + goods + '}';
    }
    
}
