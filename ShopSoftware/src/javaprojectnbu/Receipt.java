/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectnbu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My Pc
 */
public class Receipt {
    private static int Id;
    private Cashier cashier;
    private String dateAndHourOfIssue;
    private List<Good> goods;
    private static int countOfReciepts=0;
    
    
    public Receipt(Cashier cashier){
       
        this.Id++;
        this.cashier = cashier;
        this.goods = new ArrayList<Good>();
        this.countOfReciepts++;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");    
        Date date = new Date();
        this.dateAndHourOfIssue = dateFormat.format(date);
     
    }

    public static int getId() {
        return Id;
    }
   
    public void SaveRecieptIntoFile(){
        
        try  (FileWriter fw = new FileWriter("Receipt N% "+this.Id+".txt",true)){ 
           
            String info = "";
            info+=("\n"+this.cashier.getName()+"\n");
            for(Good good:this.goods){
             info+=(""+good.toString()+ "\n");
             

            }
            info+=(""+this.getDateAndHourOfIssue()+"\n");
             fw.write(info);


        } catch (IOException ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ReadReceiptFromFile(){
        try {
            BufferedReader reader= Files.newBufferedReader(Paths.get("Receipt N% "+this.Id +".txt"));
            String text = "";
            String currentLine = reader.readLine();

            while(currentLine!=null){
             text+= currentLine+"\n";
             
             currentLine = reader.readLine();

            }
            System.out.println(text);
        } catch (IOException ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static int getCountOfReciepts() {
        return countOfReciepts;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public String getDateAndHourOfIssue() {
        return dateAndHourOfIssue;
    }
    public void addGood(Good g){
     this.goods.add(g);
    }
    
    
    public double sumOfShopping(){
        double sum =0;
       for(Good good:this.goods){
         sum+= good.getPrice();
       }
       return sum;
    }
    
}
