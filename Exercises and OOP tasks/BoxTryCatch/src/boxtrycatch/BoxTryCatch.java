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
public class BoxTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Box box = new Box(120,30,40);
            box.conditionalIncreaseDimensions(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
