/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyandemplyees;

/**
 *
 * @author My Pc
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Emplyee pesho = new Emplyee("pesho",62,Contract.PARTTIME);
        System.out.println(pesho.Salary());
    }
    
}
