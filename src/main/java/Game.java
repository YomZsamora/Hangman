import java.io.*;

public class Game {

   Console myConsole = System.console();
   private int attempts = 10;
   public int wordLength;
   public char[] word;

  	public static void main(String[] args) {
      Game guessWord = new Game();      
      guessWord.startGuessing();
      guessWord.playGame();
   }

   public void startGuessing(){
      
      SelectCounty choose = new SelectCounty();
      choose.select();
      String county = choose.getCounty(); // Getter method gets selected county from SelectCounty Class
      word = county.toCharArray(); // Converts word to characters
      wordLength = word.length; // Gets word length
      System.out.println("A county has been randomly selected. Guess the county. \r\nCLUE: Word Length is " + wordLength + " characters long.\r\n");
      System.out.println("You have 10 attempts left.\r\n");
   }

   public void playGame(){
      char[] store = new char[wordLength];
      for(int e=0;e<wordLength;e++) {
            store[e] = '*';
      }
      String answer = new String(store);
      StringBuilder fill = new StringBuilder(answer);
      // For every attempt
      for(int i=0;i<attempts;i++){
         System.out.println("Please guess a letter:"); // Prompts user for letter
         String guessedLetter = myConsole.readLine();
         char letter = guessedLetter.charAt(0); // Gets the first character only of the input
         System.out.println("SELECTED: " + letter);
         // For every character in the word
         for(int j=0;j<wordLength;j++){
            if(letter == word[j]){
               fill.setCharAt(j, letter);
               System.out.println(fill);
            }
         }
      }

      System.out.println("\r\nYou have NO MORE ATTEMPTS LEFT! You've FAILED to guess the county. START AGAIN!");
   }

}