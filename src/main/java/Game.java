import java.io.*;

public class Game {

   Console myConsole = System.console();
   private int attempts;
   public int wordLength;
   public char[] word;
   public int score;
   public int guessesMade;

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
   }

   public void playGame(){
      guessesMade = 0;
      score = 0;
      attempts = 9;
      char[] store = new char[wordLength]; // Creates an array of the same length as the selected word
      for(int e=0;e<wordLength;e++) {
            store[e] = '_'; // Replaces all values in the array with an asterisk (*)
      }
      String answer = new String(store); // Converts store[] into a String
      StringBuilder fill = new StringBuilder(answer); 
      // For every attempt
      for(int i=0;i<10;i++){
         System.out.println("You have " + attempts + " attempts left.");
         System.out.println("Please guess a letter:"); // Prompts user for letter
         String guessedLetter = myConsole.readLine();
         char letter = guessedLetter.charAt(0); // Gets the first character only of the input
         System.out.println("SELECTED: " + letter);
         // For every character in the word
         for(int j=0;j<wordLength;j++){
            if(letter == word[j]){
               fill.setCharAt(j, letter); // If true, add letter to fill[j]
               System.out.println(fill + "\r\n"); // Then print it out
               score++; // Gives player score if correct letter
            }            
         }
         String countyName = new String(fill);
         guessesMade++; 
         attempts--;
         if(score == wordLength){ // Checks if current score is same as word length. If yes, player wins!
            System.out.println("\r\nCONGRATULATIONS! You have GUESSED the county CORRECTLY. The county was " + countyName.toUpperCase() + ".");
            i=10; // Ends loop
         }
         if (guessesMade == 10) { // If attempts made are 10 in total, then player has exhausted
            System.out.println("\r\nYou have NO MORE ATTEMPTS LEFT! You've FAILED to guess the county. START AGAIN!"); 
         }
      }      
   }
}