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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PrivateShow sh = new PrivateShow(100,"Miami",TypeOfPlace.OUTDOOR,2);
       PrivateShow anotherShow = new PrivateShow(50,"Plovdiv",TypeOfPlace.INDOOR,3);
       MusicBand band = new MusicBand("Metalica",4);
       band.AddShow(sh);
       band.AddShow(anotherShow);
      System.out.println("First show: "+ sh.toString());
      System.out.println("Second show: "+ anotherShow.toString());
      System.out.print("Band: " + band.toString());
      System.out.println("The minimum base price: "+PrivateShow.getMinBasePrice());
      System.out.println("Is outdoore firstShow: "+sh.IsOutDoor());
      System.out.println("Is outdoore secondShow: "+anotherShow.IsOutDoor());

      
      System.out.println("Compare Shows: "+sh.CompareShows(anotherShow));
      System.out.println("Compare PrivateSows: "+sh.ComparePrivateShows(anotherShow));
      System.out.println("Band's Income: "+band.Income());
      System.out.println("Income for every musician: "+ band.IncomeOfEveryParticipant());
      System.out.println("Income by type: "+ band.IncomeByType(TypeOfPlace.OUTDOOR));

    }
    
}
