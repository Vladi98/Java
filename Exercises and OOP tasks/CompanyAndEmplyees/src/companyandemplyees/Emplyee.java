/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyandemplyees;

/**
 *
 * @author My Pc
 */
public class Emplyee {
   private String name;
   private int Id;
   private double workHoursPerMonth;
   private Contract contr;
   private double bonus;
   private static int idCounter;

    public Emplyee(String name, double workHoursPerMonth,Contract contr) {
        this.name = name;
        this.workHoursPerMonth = workHoursPerMonth;
        idCounter+=1;
        this.Id = idCounter;
        this.contr=contr;
    }

    public int getId() {
        return Id;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
   
    
    public double minIncomePerHour(){
      
        if(Contract.PERMANENT == this.contr){
           return 10;
        }
        else if(this.contr == Contract.PARTTIME){
          return 7;
        }        
        return 5;
    }
    
    public double Salary(){
     return this.workHoursPerMonth*this.minIncomePerHour()+this.getBonus();
    }

    @Override
    public String toString() {
        return "Emplyee{" + "name=" + name + ", Id=" + Id + ", workHoursPerMonth=" + workHoursPerMonth + ", contr=" + contr + ", bonus=" + bonus + '}';
    }
    
    
}


