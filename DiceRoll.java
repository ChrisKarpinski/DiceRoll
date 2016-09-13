/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This program rolls a die and asks the user to guess the die value
 *
 ****************************************************************************/


import java.util.Random;
import java.util.Scanner;

public class randomNumber {

 public static void main(String[] args)
 {

     Random generator = new Random();
     Scanner scan = new Scanner(System.in);
     int correctCounter;

     int randomNumber = generator.nextInt(6) + 1;
     int userGuess;

     System.out.println("Try to guess which number rolled on the dice");
     userGuess = scan.nextInt();
     correctCounter++;

     while (!(userGuess == randomNumber)) {

         System.out.println("Incorrect! Try again");
         userGuess = scan.nextInt();
         correctCounter++;

     }

     if (userGuess == randomNumber) {

         System.out.println("Congratulations, you got it correct!");
         System.out.println("You guessed it in " + correctCounter + " tries");
         System.out.println("");
         System.out.println("Done.");

     }

 }

}
