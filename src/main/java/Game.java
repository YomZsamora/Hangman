import java.io.*;
import java.util.Random;

public class Game {
  	public static void main(String []args) {
      Console myConsole = System.console();
  		selectWord();
      System.out.println("You've selected a county. Guess the county.");
   }

   public static String selectWord() {
   	Console myConsole = System.console();
    	String[] counties = {"nyamira", "bungoma", "kakamega", "nyandarua", "marsabit", "mandera", "garissa", "kilifi", "kwale", "mombasa"};
    	Random rand = new Random();
    	int x = rand.nextInt(counties.length);
    	return counties[1];
  	}
}