import java.io.*;

public class Game {

   Console myConsole = System.console();
   private int attempts = 10; 

  	public static void main(String[] args) {
      Game guessWord = new Game();      
      guessWord.startGuessing();
      guessWord.playGame();
   }

   public void startGuessing(){
      
      SelectCounty choose = new SelectCounty();
      choose.select();
      String county = choose.getCounty();
      char[] word = county.toCharArray();
      System.out.println("A county has been randomly selected. Guess the county. \r\nClue: Word Length is " + word.length + " characters long.");
      System.out.println("You have 10 attempts left.\r\n \r\n ****** \r\n ");
   }

   public void playGame(){
      // System.out.println(attempts);
      for(int i=0;i<attempts;i++){
         System.out.println("Please guess a letter:");
         String guessedLetter = myConsole.readLine();
         System.out.println(guessedLetter);
      }

      System.out.println("\r\nYou have NO MORE ATTEMPTS LEFT! Start again.");
   }

}