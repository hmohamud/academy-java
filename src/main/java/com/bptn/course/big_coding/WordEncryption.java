package com.bptn.course.big_coding;

import java.util.Scanner;

public class WordEncryption {
    public static void main(String[] args) {
        //open scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user to provide input word
        System.out.print("Enter a word to encrypt: ");
        //save input to variable word
        String word = scan.nextLine();
        
        //initialize new variable to hold output
        String encrypted = "";

        for(int i = 0; i < word.length(); i++) {
            //condition checks if char is between A and Z or a and z
            if((word.charAt(i) >= 65 && word.charAt(i) <= 90) || word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                //if the char is Z, it becomes A
                if(word.charAt(i) == 'Z'){
                    encrypted += 'A';
                }
                //if the char is z, it becomes a
                else if(word.charAt(i) == 'z'){
                    encrypted += 'a';
                }
                //otherwise increment char
                else{
                    encrypted += (char) (word.charAt(i) + 1);
                }
            }
            //if the char isn't between 'A' and 'Z' or 'a' and 'z', just add it to encrypted
            else{
                encrypted += (word.charAt(i));
            }
        }

        //return the encrypted string
        System.out.println("Encrypted word: " + encrypted);
        scan.close();

    }
}

/* The problem to solve here is we want to encrypt a given string by user and return it
to do so we have to open the scanner to allow user input
after that we prompt the user to enter a string to encrypt
we save that input to the string word, and use it to work to find the encrypted version of it
we also initialize another string called encrypted, which will become the output that we return to the user

Next we start a new for loop, since we will be iterating over the length of the string
Since we do not change non alphabetic chars, we first check if the char at the index is between 'A' and 'Z'
or 'a' and 'z'
if that is true, we also check if the letter is 'z' or 'Z',
and if that is the case, we loop the letter back to 'a' or 'A' respectively and add it to the encrypted word
otherwise, we increment the letter and add it to the encrypted string

if the letter is not between 'A' and 'Z' or 'a' and 'z', it must be a non alphabetic char,
so we just add it to the encrypted string without changing it

after going through all indexes of the string, we end the loop 
and print a line to satisfy the output of the program, and close the scanner
*/

