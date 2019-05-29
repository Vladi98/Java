/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectnbu;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My Pc
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shop shop = new Shop();

        Cashier c = new Cashier("Ivan","345");
        Cashier c2= new Cashier("Pesho","385");
        Cashier c3 = new Cashier("Toshko","315");

        Good g=new Good("stoka",445,5.00,"20/04/2020");
        Good g2=new Good("kartof",444,10.00,"19/09/1998");
        Good g3=new Good("magdanoz",455,9.00,"28/05/1998");
        List<Receipt> receipts = new ArrayList();


        
       
      
        shop.DeliverGood(g,10);
        shop.DeliverGood(g2,5);
        shop.DeliverGood(g3,20);
         
       

        //System.out.println(shop.CountOfReceipts());
        shop.getGoods();
        try {
          Receipt  receipt = new Receipt(c);
            shop.SellGood(g, 5,c,receipt);
            
            shop.SellGood(g3, 5, c3, receipt);
            System.out.println("Sum of shopping: "+receipt.sumOfShopping());

            Receipt receipt2 = new Receipt(c2);
            shop.SellGood(g3, 6, c2, receipt2);
            System.out.println("Sum of shopping: "+receipt2.sumOfShopping());
            receipts.add(receipt);
            receipts.add(receipt2);
            //shop.SellGood(g3, 50, c3, receipt);
         
            shop.getCountOfReciepts();
            System.out.println("Shop's total profit: " + shop.CurrentIncome());
            //receipts.add(receipt3);
            

        } catch (Exception ex) {
            Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            shop.Pay(receipts);
            
        }
       
        //System.out.println(receipt.sumOfShopping());
      
       
        
      
    }
    
}
