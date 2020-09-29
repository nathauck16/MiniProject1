
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
      int randomNumber = numToGuess.nextInt(userNum -1) + 1;
      
      // check random number. comment out later
      System.out.println("the random number is: " + randomNumber);

      System.out.println("A random number to guess has been generated");

      playGame(randomNumber, userNum);
  }

//new method
  static void playGame(int theRandomNumber, int theUserNum) {
      Scanner guess = new Scanner(System.in);
      System.out.println("please guess a number between 0 and " + theUserNum);
      int userGuess;
      int numGuesses = 0;
      

      do{
         userGuess = guess.nextInt();
         numGuesses ++;
         if(userGuess > theRandomNumber){
           System.out.println("Incorrect. Enter your new guess(Try guessing lower!)");
         } else if(userGuess < theRandomNumber){
           System.out.println("Incorrect. Enter your new guess(Try guessing higher!)");
         }
      } while(userGuess != theRandomNumber);
      if (userGuess == theRandomNumber){
        System.out.println("Great, you win! It took you " +
        numGuesses + " tries!" );
      }
  }
}