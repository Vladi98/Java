/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagoods;

/**
 *
 * @author My Pc
 */
public class Vehicle extends Good {
    private double expensesForEmployees;
    private double expensesForMaterials;

    public Vehicle(double expensesForEmployees, double expensesForMaterials, double overcharge) {
        super(overcharge);
        this.expensesForEmployees = expensesForEmployees;
        this.expensesForMaterials = expensesForMaterials;
    }

   

    @Override
    public double totalPrice() {
       return this.expensesForEmployees+this.expensesForMaterials;
    }
    
    
}
