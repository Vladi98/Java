/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxtrycatch;

/**
 *
 * @author My Pc
 */
public class Box {
    private int sideA;
    private int sideB;
    private int sideC;

    public Box(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    
    
    public void IncreaseDimensions(int increasePercent) throws Exception{
        if(increasePercent<0|| increasePercent>100){
          throw new Exception("Incorrent percents");
        }
      
    }
    
    public void conditionalIncreaseDimensions(int increasePercent) throws Exception{
      
        IncreaseDimensions(increasePercent);
        if(volume()<increasePercent){
            
        this.sideA+=this.sideA*increasePercent/100;
        this.sideB+=this.sideA*increasePercent/100;
        this.sideC+=this.sideA*increasePercent/100;
        }
    }
    
    public int volume(){
      return this.sideA*this.sideB*this.sideC;
    }
}
