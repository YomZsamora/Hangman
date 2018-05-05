import java.io.*;

public class Game {
   private String selectedCounty;

  	public static void main(String[] args) {
      SelectCounty choose = new SelectCounty();
      choose.select();
      String word = choose.getCounty();
      System.out.println(word);
   }
}