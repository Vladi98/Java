/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectnbu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author My Pc
 */
public class Shop {
    private List<Good> goods;
    private List<Cashier> cashiers;
    private List<Good> soldGoods;
    private int countOfReceipts;

    public Shop() {
        this.countOfReceipts=0;
        this.goods = new ArrayList<Good>();
        this.cashiers = new ArrayList<Cashier>();
        this.soldGoods = new ArrayList<Good>();

    }

    public List<Good> getGoods() {
        return goods;
    }


    public double CountOfReceipts(){
       return 0;
    }
    public void DeliverGood(Good good,int quantity){
        for (int i = 0; i < quantity; i++) {
            this.goods.add(good);
        }
        System.out.println("Added " +quantity + " kg " + "of " + good);
    }
    
    public void SellGood(Good good,int quantity,Cashier ca,Receipt re) throws Exception{
        int cntQuantity=0;
       
       for(Good g:this.goods){
         if(g==good){
            cntQuantity++;
         }
       }
       if(cntQuantity<=quantity){
          throw new NotEnoughQuantityException("Not enough quantity of "+good.getName()+". Needed "+(quantity-cntQuantity)+"kg");
       }
           //Receipt re = new Receipt(ca);
           
           for (int i = 0; i < quantity; i++) {
               this.goods.remove(good);
               this.soldGoods.add(good);
               re.addGood(good);
           }
              re.SaveRecieptIntoFile();
              re.ReadReceiptFromFile();
          System.out.println("Sold " +quantity + " kg " + "of " + good);
        
       
    }
    
    public double CurrentIncome(){
        double income =0;
       for(Good good:this.soldGoods){
        income+= good.getPrice();
       }
       return income;
    }
    
    public void getCountOfReciepts(){
      System.out.println("Count of reciepts: "+Receipt.getCountOfReciepts());
    }

    @Override
    public String toString() {
        return "Shop{" + "goods=" + goods + ", cashiers=" + cashiers + ", soldGoods=" + soldGoods + '}';
    }
    
    public void Pay(List<Receipt> receipts){
        List<Receipt> rec = new ArrayList<Receipt>();
        List<Receipt> rec2 = new ArrayList<Receipt>();

        for (int i = 0; i < receipts.size()/2; i++) {
            rec.add(receipts.get(i));
        }
        
        for (int i = receipts.size()/2; i < receipts.size(); i++) {
            rec2.add(receipts.get(i));
        }
        
        Thread t1 = new Thread(new PayDesk(rec));
        t1.start();
        Thread t2 = new Thread(new PayDesk(rec2));
        t2.start();
    }
  
}
