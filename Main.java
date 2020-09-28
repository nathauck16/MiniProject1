
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

      int userNum = s.nextInt();
      Random numToGuess = new Random();
      int randomNumber = numToGuess.nextInt(userNum) + 1;
      // check random number. comment out later
      System.out.println("the random number is: " + randomNumber);

      System.out.println("A random number to guess has been generated");

      playGame(numToGuess, userNum);
  }

  static void playGame(Random theNumToGuess, int theUserNum) {
      Scanner guess = new Scanner(System.in);
      System.out.println("please guess a number between 0 and the number you just entered.");
      int userGuess = guess.nextInt();
      int numGuesses = 0;

      while (userGuess = theNumToGuess){
        System.out.println("CORRECT!");
      }

      while(userGuess > theNumToGuess){
        System.out.println("Incorrect. Enter your new guess(Try guessing lower!)");
      }
    
  }
}