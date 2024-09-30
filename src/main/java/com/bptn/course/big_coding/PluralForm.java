package com.bptn.course.big_coding;

import java.util.Scanner;

public class PluralForm {
    public static void main(String[] args) {
        //create a new scanner to prepare for user input
        Scanner scan = new Scanner(System.in);

        //variable to control do while loop
        boolean loopCheck = false;
        
        //initialize output noun variable
        String finalStr = "";

        //Beginning welcome, and prompt user for inputs, and save inputs to variables
        System.out.println("Welcome to Pluralizing Nouns, we need a number and a word.");
        do{
            //use scanner to get a number, save it to amt
            System.out.print("Enter a number: ");
            int amt = scan.nextInt();

            //check if amt is non negative
            if(amt < 0) {
                System.out.println("Please enter a non negative number.");
                loopCheck = true;
                continue;
            }
            
            //use scanner to get a noun, save it to word
            System.out.print("Enter a noun: ");
            scan.nextLine();
            String word = scan.nextLine();

            //case if amt = 1, just print the number and word
            if(amt == 1) {
                System.out.println(amt + " " + word);
            }

            //in case when amt is 0 or greater than 1, we have multiple conditions
            if(amt == 0 || amt > 1) {

                //if the word ends in fe, change "fe" to "ves" in word
                if((word.substring(word.length() - 2)).equals("fe")){
                    finalStr = word.substring(0, word.length() -2) + "ves";
                }

                //if word ends in sh or ch, add "es" to word
                else if((word.substring(word.length() - 2)).equals("sh") || (word.substring(word.length() - 2)).equals("ch")){
                    finalStr = word + "es";
                }

                //if word ends in us, change "us" to "i" in word
                else if((word.substring(word.length() - 2)).equals("us")){
                    finalStr = word.substring(0, word.length() -2) + "i";
                }

                //if word ends in y, we have nested if cases
                else if((word.substring(word.length() - 1)).equals("y")){
                    //subcase 1: if word ends in ay, oy, ey, uy, add "s" to the end of word
                    if((word.substring(word.length() - 2)).equals("ay") || (word.substring(word.length() - 2)).equals("oy") ||
                    (word.substring(word.length() - 2)).equals("ey") || (word.substring(word.length() - 2)).equals("uy")){
                        finalStr = word + "s";
                    }

                    //in other cases when word ends in y, change "y" to "ies"
                    else{
                        finalStr = word.substring(0, word.length() -1) + "ies";
                    }
                }
                
                //check if inputted word is already plural
                else if(((word.substring(word.length() - 1)).equals("s"))){
                    finalStr = word;
                }

                //in all other cases, add "s" to end of word
                else{
                    finalStr = word + "s";
                }

                //print the final answer
                System.out.println(amt + " " + finalStr);
                
                //break out of loop
                loopCheck = false;
            }
        }while(loopCheck); //only loop if you input an invalid number

        //close the scanner
        scan.close();

    }
}

/*
The problem to solve is to write a program that can pluralize Nouns
start off by creating a scanner object, and creating a variable to guard our do-while loop
also create a variable that will hold our final noun we output

We start the loop with welcoming and prompting user to enter a number and noun
if the number is less than 0, we prompt user to enter a non negative number, and loop again to allow them to try again
in other cases we just have 1 iteration of the loop

we also check if the number provided is equal to 1, and if so we just return the number and noun without changing them

in cases when the number is equal to 0 or greater than 1, we check the cases to pluralize the noun
as per the instructions

What was new about this task was having to mix string methods in order to get the conditions to check if we are in a specific case
*/

