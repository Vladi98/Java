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
public class Painter extends Creator{
    private int countOfsoldPaintings;

    public Painter(int countOfsoldPaintings) {
        this.countOfsoldPaintings = countOfsoldPaintings;
    }
    
    public void AddPainting(Painting paint){
      goods.add(paint);
    }
    
    public void DisplayGoods(){
      
        for(Good item: goods){
          System.out.println(item.toString());
          System.out.println(item.salePrice());
          System.out.println(item.totalPrice());
        }
    }
    
        public double TotalEarnings() {
        double sum =0;
       for(Good item:goods){
           sum+=item.salePrice();
       }
       return sum;
    }
    
    
}
