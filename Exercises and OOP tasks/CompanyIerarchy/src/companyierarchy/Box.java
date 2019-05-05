/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyierarchy;

/**
 *
 * @author My Pc
 */
public class Box {
    private double sideA;
    private double sideB;
    private double sideC;
 

    public Box(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
       
    }
    
    public double BoxArea(){
      return this.sideA*this.sideB*this.sideC;
    }
}
