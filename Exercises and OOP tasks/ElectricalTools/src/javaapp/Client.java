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
public class Client { 
    
    private double budget;

    public Client(double budget) {
       
        this.budget = budget;
    }
    
 
    
    public String CanAffordProduct(ElectricalTool tool){
      if(this.budget >= tool.getPrice()){
          this.budget-=tool.getPrice();
         
         return "Yes the client can afford the "+ tool;
      }
      return "No the client can not afford the "+ tool;

    }

    @Override
    public String toString() {
        return "Client{" + "budget=" + budget + '}';
    }
    
    
}
