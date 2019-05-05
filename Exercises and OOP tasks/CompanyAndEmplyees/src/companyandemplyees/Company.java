/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyandemplyees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My Pc
 */
public class Company {
     private String name;
     private int maxCountOfEmployees;
     private List<Emplyee> employees;

    public Company(String name, int maxCountOfEmployees) {
        this.name = name;
        this.maxCountOfEmployees = maxCountOfEmployees;
        this.employees = new ArrayList<Emplyee>();
    }
     
    public void HireEmpolyee(Emplyee empl){
      if(!this.employees.contains(empl) && this.employees.size()<this.maxCountOfEmployees){
        this.employees.add(empl);
      }
    }
    
    public void FireEmpolyee(Emplyee empl){
      if(this.employees.contains(empl)){
        this.employees.remove(empl);
      }
    }
    
    public void ShowEmployees(){
      
        System.out.println("All hired employees: \n");
        for(Emplyee emp: this.employees){
          System.out.println(emp);
        }
    }
    
    public double ShowAllSalaries(){
        double sum =0;
       for(Emplyee emp: this.employees){
          sum+=emp.Salary();
        }
       return sum;
    }
    
    public double AverageSalaryOfEmployees(){
        double sum =0;
       for(Emplyee emp: this.employees){
          sum+=emp.Salary();
        }
       return sum/this.employees.size();
    }
    public double IncreaseBonus(Emplyee e, double increase){
      double bonus = e.getBonus()+(e.getBonus()+increase/100);
      e.setBonus(bonus);
      return e.getBonus();
    }
    
      public void IncreaseBonusOfAllEmpl(double increase){
     
        for(Emplyee e: this.employees){
          double bonus = e.getBonus()+(e.getBonus()+increase/100);
           e.setBonus(bonus);
           System.out.println("Bonus: "+e.getBonus()+"\n");
        }
      
    }
      
    public void ShowEmployeesOfcurrentCompany(){
        System.out.println("Company name: "+ this.name);
        System.out.println("Company's max count of emplyees: "+ this.maxCountOfEmployees);
        System.out.println("Company's current count of emplyees: "+ this.employees.size());
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", maxCountOfEmployees=" + maxCountOfEmployees + ", employees=" + employees + '}';
    }
     
}
