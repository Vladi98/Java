/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproduct;

/**
 *
 * @author My Pc
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Company ivan = new SoftwareCompany(200,50,"Ivan",10);
       // SoftwareProduct pr
      SoftwareProduct pr = new SoftwareProduct("burger",20,ProductType.DESKTOP);
      SoftwareProduct r = new SoftwareProduct("burger",20,ProductType.DESKTOP);
      SoftwareProduct p = new SoftwareProduct("burger",20,ProductType.WEB);
      SoftwareProduct pqr = new SoftwareProduct("burger",20,ProductType.DESKTOP);

       ivan.SellProduct(pr);
       ivan.SellProduct(p);
       ivan.SellProduct(r);
       ivan.SellProduct(pqr);

        System.out.println(ivan.Income());
    }
    
}
