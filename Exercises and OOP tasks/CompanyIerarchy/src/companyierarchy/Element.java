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
public class Element extends Material {

    
    private double weight;
    
    public Element(double weight,String name, boolean isBreakable) {
        super(name, isBreakable);
        this.weight = weight;
    }

  
    public boolean IsItBreakable(){
      return super.getIsBreakable();
    }
    

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Element{" + "weight=" + weight + '}' +" " + super.toString();
    }


  

   
    
}
