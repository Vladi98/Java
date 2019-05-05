/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My Pc
 */
public class MusicBand {
    private String name;
    private int countOfMusicians;
    private List<Show> shows;

    public MusicBand(String name, int countOfMusicians) {
        this.name = name;
        this.countOfMusicians = countOfMusicians;
        this.shows = new ArrayList<Show>();
    }
   
       
    
    public void AddShow(Show sh){
      this.shows.add(sh);
    }
    
    public double Income(){
        double sum =0;
      for(Show sh:this.shows){
        sum+= sh.showPrice();
      }
      return sum;
    }
    
    public double IncomeOfEveryParticipant(){
        double sum =0;
      for(Show sh:this.shows){
        sum+= sh.showPrice();
      }
      return sum/this.countOfMusicians;
    }
    
    public double IncomeByType(TypeOfPlace type){
      double sum=0;
      
      for(Show sh: this.shows){
      
       if(sh.getType()==type){
         sum+=sh.showPrice();
       }
      }
       return sum;
    }

    @Override
    public String toString() {
        return "MusicBand{" + "name=" + name + ", countOfMusicians=" + countOfMusicians + ", shows=" + shows + '}';
    }
    
    
}
