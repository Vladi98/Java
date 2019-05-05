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
public class Engineer extends Creator {
    private double SalaryPerHour;
    private double workedHours;


    public Engineer(double SalaryPerHour, double workedHours) {
        this.SalaryPerHour = SalaryPerHour;
        this.workedHours = workedHours;
        //this.vehicles = new ArrayList<Vehicle>();
    }
    
    public void AddVehicle(Vehicle v){
        this.goods.add(v);
    }
    
    
    public double TotalEarnings() {
        double sum =0;
       for(Good item:goods){
           sum+=item.salePrice();
       }
       return sum;
    }

    @Override
    public String toString() {
        return "Engineer{" + "SalaryPerHour=" + SalaryPerHour + ", workedHours=" + workedHours + '}';
    }
    
}
