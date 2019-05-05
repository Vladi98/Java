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
public class CourierCompany{
    private int countOfItemsTranspored;
    private List<Item> Items;

    public CourierCompany(int countOfItemsTranspored) {
        this.countOfItemsTranspored = countOfItemsTranspored;
        this.Items = new ArrayList<Item>();
    }

    public void AddItem(Item i){
      this.Items.add(i);
    }

   
    public double TotalPrice() {
        double price =0;
      for(Item element : Items){
        price += element.getShipmentPricePerKg()+element.getShipmentPricePerKg();
      }
      return price;
    }

    @Override
    public String toString() {
        return "CourierCompany{" + "countOfItemsTranspored=" + countOfItemsTranspored + ", Items=" + Items + '}';
    }

  
}
