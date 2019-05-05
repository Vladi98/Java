/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproduct;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My Pc
 */
public class SoftwareCompany extends Company {

   private double expensesForEmployees;
   private double rentExpenses;
   private List<SoftwareProduct> soldProducts;
   
    public SoftwareCompany(double expensesForEmployees, double rentExpenses, String name, int countOfEmployees) {
        super(name, countOfEmployees);
        this.expensesForEmployees = expensesForEmployees;
        this.rentExpenses = rentExpenses;
        this.soldProducts =  new ArrayList<SoftwareProduct>();
    }
    
   
   
    @Override
    public double TotalProfit() {
       return this.Income()-this.TotalCosts();
    }

    @Override
    public double TotalCosts() {
        return this.expensesForEmployees+this.rentExpenses;
    }

    @Override
    public double Income() {
        double sum =0;
        for(SoftwareProduct pr: soldProducts){
         sum+= pr.getPrice();
        }
        return sum;
    }
    
    public void SellProduct(SoftwareProduct pr){
      this.soldProducts.add(pr);
    }
    
    public double ProfitOfSameProducts(ProductType prType){
        double inc =0;
      for(SoftwareProduct pr : soldProducts)
      {
        if(pr.getPr()==prType){
          inc+=pr.getPrice();
        }
      }
      return inc;
    }
    
   
    
    
}
