
/*
Mini Project 1
Group # : Nat Hauck,
Date: 9/28/2020
*/
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
      System.out.println("Welcome to the guessing game!!!");
      Scanner s = new Scanner(System.in);
      System.out.println("Please enter any positive whole number to continue: ");

      //variables
      int userNum = s.nextInt();
      Random numToGuess = new Random();
      int randomNumber = numToGuess.nextInt(userNum) + 1;
      int numToGuess;
      // check random number. comment out later
      System.out.println("the random number is: " + randomNumber);

      System.out.println("A random number to guess has been generated");

      playGame(numToGuess, userNum);
  }

//new method
  static void playGame(Random theNumToGuess, int theUserNum) {
      Scanner guess = new Scanner(System.in);
      System.out.println("please guess a number between 0 and " + theUserNum);
      int userGuess;
      int numGuesses = 0;
      numGuesses++;

      do{
         userGuess = guess.nextInt();
         guessCount ++;
         if(userGuess > theNumToGuess){
           System.out.println("Incorrect. Enter your new guess(Try guessing lower!)");
         } else if(userGuess < theNumToGuess){
           System.out.println("Incorrect. Enter your new guess(Try guessing higher!)");
         }
      } while(userGuess!= theNumToGuess);
      if (userGuess == theNumToGuess){
        System.out.println("Great, you win! It took you " +
        guessCount + "tries!" );
      }
  }
}