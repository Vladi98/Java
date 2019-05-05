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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Engineer en = new Engineer(10,12);
        Vehicle v = new Vehicle(200,50,10);
        en.AddVehicle(v);
        en.DisplayGoods();
    }
    
}
