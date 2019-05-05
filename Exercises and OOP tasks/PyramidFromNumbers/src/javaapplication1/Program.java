/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author My Pc
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number =5;
        NumberGenerator(5);
    }
    
    public static void NumberGenerator(int number){
            int jCounter = 1;
            int iCounter = 1;
            String str = "";
            for (int k = 0; k < number; k++)
            {
                System.out.println();
                 System.out.print(str);

                str += " ";
                for (int i = iCounter; i <= number; i++)
                {

                     System.out.print(i);

                }

                for (int j = number; j >= jCounter; j--)
                {
                    System.out.print(j);
                }
                iCounter++;
                jCounter++;

            }
            iCounter = number; 
            jCounter = 0;

            str = str.substring(1);
            for (int k = 0; k < number-1; k++)
            {
                str = str.substring(1);
              System.out.println();
                 System.out.print(str);
                
                iCounter--;
                jCounter++;
                for (int i = iCounter; i <= number; i++)
                {
                     System.out.print(i);

                }

                for (int j = number; j >= number-jCounter; j--)
                {
                    System.out.print(j);
                }
            }
             System.out.println();
    }
    
}
