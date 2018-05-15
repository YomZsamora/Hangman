import java.io.*;
import java.util.Random;

public class SelectCounty{

	private String selectedCounty;

	public void select(){
      Console myConsole = System.console();
      System.out.println("Lets play the classic Hangman. You can either play by yourself or with a friend. Press Enter to continue:");
      myConsole.readLine();
      String[] counties = {"nyamira", "bungoma", "kakamega", "nyandarua", "marsabit", "mandera", "garissa", "kilifi", "kwale", "mombasa", "migori", "kiambu", "siaya", "kajiado", "kericho", "laikipia", "samburu", "kirinyaga", "lamu", "isiolo"};
      Random rand = new Random(); 
    	int x = rand.nextInt(counties.length); // Generates random number according to array's length
    	selectedCounty = counties[x]; // Assigns value
   }

   public String getCounty() {
      return selectedCounty; // Getter method returns selected county
   }
}