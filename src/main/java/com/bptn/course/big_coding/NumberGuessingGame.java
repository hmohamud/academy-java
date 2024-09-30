package com.bptn.course.big_coding;

import java.util.Scanner;
import java.lang.Math;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //open scanner 
        Scanner scan = new Scanner(System.in);

        //set the target to a random number between 1 and 100
        int targetNumber = (int) (Math.random() * (100 - 1)) - 1;

        //boolean to control while loop condition
        boolean userChoice = true;

        while(userChoice){
            //Prompt user to input a number between 1 and 100
            System.out.print("Enter your guess between 1 and 100: ");

            //save input in variable guess
            int guess = scan.nextInt();

            //if guess is the target number, print Congrats and break loop
            if(guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            }

            //if guess is less than target number, print too low and loop again
            if(guess < targetNumber) {
                System.out.println("Too low! Try again.");
            }

            //if guess is greater than target number, print too high and loop again
            if(guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }

            // System.out.println("Do you wish to continue guessing (enter y or n): ");
            // String quit = scan.next();
            // if(quit.equals("n")){
            //     System.out.println("The target number was: " + target);
            //     break;
            // }

        }
        scan.close();

    }
}

/*in this task, we are supposed to make a guess the number game
to do so, we need to take user input, create a random number between 1 and 100
and run a loop for the game
We use random() from math class to save a random number to a variable for reference

We then start the while loop, with initial condition to be true
We prompt and get user input for a random number between 1 and 100
and save it to guess variable

We set up 3 if conditions to check if the guess is greater, less or equal to the target
if it is equal to the target, print Congratulations and break loop
if it is less than target, print Too low
if it is greater than target, print Too high
in case when guess is too low or too high, we loop again to allow user to try again

*/

//Note, my code works correctly when testing it, but auto grader has everything failed with no message on what is wrong
//I dont know if it is because of variable names