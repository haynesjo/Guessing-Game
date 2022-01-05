import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  Scanner a = new Scanner(System.in);
    Random b = new Random ();
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number: ");
      int userNum = a.nextInt();
      int randomNum = b.nextInt(userNum);
      System.out.println("A random number to guess has been generated");
        playGame(randomNum,userNum);
  }

  static void playGame(int randomNumber,int input){
    System.out.println("Please enter a number between 0 and " + input);
    Scanner c = new Scanner(System.in);
      int userGuess = c.nextInt();
      int numTries = 1; 
      while (userGuess != randomNumber){
        if (randomNumber < userGuess){
          System.out.println("Guess lower!");
          System.out.println("Enter your new number:");
          userGuess =c.nextInt();
        numTries = numTries + 1;
        }
        else if (randomNumber > userGuess){
          System.out.println("Guess higher!");
        System.out.println("Enter your new number:");
        userGuess =c.nextInt();
        numTries = numTries + 1;
        }
      }
        if (randomNumber == userGuess){
          System.out.println("Great you win! It took you " + numTries + " tries!");
        }
      }
      }
        
        