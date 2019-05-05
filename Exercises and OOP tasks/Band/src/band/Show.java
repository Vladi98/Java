/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band;

/**
 *
 * @author My Pc
 */
public abstract class Show {
    private String place;
    private TypeOfPlace type;
    private double runTime;

    public Show(String place, TypeOfPlace type, double runTime) {
        this.place = place;
        this.type = type;
        this.runTime = runTime;
    }

    public abstract double showPrice();
    
    public boolean IsOutDoor(){
      if(this.type==TypeOfPlace.OUTDOOR){
         return true;     
       }
      return false;
    } 
    
    public Show CompareShows(Show sh){
       if(this.runTime>sh.runTime){
         return this;
         
       }
       return sh;
    }

    @Override
    public String toString() {
        return "Show{" + "place=" + place + ", type=" + type + ", runTime=" + runTime + '}';
    }

    public double getRunTime() {
        return runTime;
    }

    public TypeOfPlace getType() {
        return type;
    }
    
    
}
