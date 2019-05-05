/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author My Pc
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ElectricalTool el= new ElectricalTool("Bosh",200,12,true);
        ElectricalTool eC = new ElectricalCooker("Samsung",400.0,12,true);
        ElectricalTool gC = new GasCooker("Samsung",400.0,12,true);
        ElectricalTool machine = new WashingMachine(50.4,true,"BOCH",600.0,12,false);
        

        Client pesho = new Client(1000);

        //System.out.println(el.toString());
        System.out.println(eC.toString());
        System.out.println(gC.toString());


        System.out.println(machine.toString());
        
        System.out.println(pesho .CanAffordProduct(gC));
        System.out.println(pesho .CanAffordProduct(gC));

        System.out.println(pesho.toString());
    }
    
}
