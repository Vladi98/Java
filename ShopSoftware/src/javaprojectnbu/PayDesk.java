/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectnbu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My Pc
 */
public class PayDesk implements Runnable{

    
    private List<Receipt> receipts;

    public PayDesk(List<Receipt> receipts) {
       
        this.receipts = new ArrayList<Receipt>();
        this.receipts = receipts;
    }

    @Override
    public void run() {
      for(Receipt receipt: receipts){
      
       System.out.println("Currently working Cashier: " +receipt.getCashier().toString() + "Receipt total sum: " +receipt.sumOfShopping());
      }
    }
    
}
