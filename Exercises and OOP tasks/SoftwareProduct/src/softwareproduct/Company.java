/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproduct;

/**
 *
 * @author My Pc
 */
public abstract class Company {
    
    private String name;
    private int countOfEmployees;

    public Company(String name, int countOfEmployees) {
        this.name = name;
        this.countOfEmployees = countOfEmployees;
    }
  
    
    
    public abstract double TotalProfit();
    public abstract double TotalCosts();
    
    public boolean CompareCompanies(Company c){
      if(this.TotalProfit()> c.TotalProfit()){
         return true;
      }
      return false;
    }
        public abstract void SellProduct(SoftwareProduct pr);
    
       
    
    public abstract double Income();
      
    
}