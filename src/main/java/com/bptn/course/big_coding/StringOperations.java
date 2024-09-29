package com.bptn.course.big_coding;

import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);
        
        do {

            System.out.println("/..String Menu../");
            System.out.println("Press 1 for Palindrome Check\nPress 2 for reverse a String");
            System.out.println("Press 3 for Concatenate 2 Strings\nPress 4 for String Comparison");
            System.out.println("Press 5 to Calculate the length of String");
            System.out.println("Enter the option");

            int myChoice = myScan.nextInt();
            String firstString = "";
            String secondString = "";
            String result = "";
            boolean isFinished = true;

            switch(myChoice) {
                case 1:
                    System.out.println("Palindrome Check");
                    System.out.println("Enter a string: ");
                    firstString = myScan.next();
                    
                    int k = 0;
                    int j = firstString.length() - 1;

                    for(k = 0; k < j; k++) {
                        if(firstString.charAt(k) != firstString.charAt(j)){
                            System.out.println(firstString +" is not a palindrome");
                            break;
                        }
                        j--;
                    }
                    if(k >= j) {
                        System.out.println(firstString +" is a palindrome");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Reverse a String");
                    System.out.println("Enter a string: ");
                    firstString = myScan.next();

                    for(int i = firstString.length() -1; i >=0; i--){
                        secondString += firstString.charAt(i);
                    }

                    System.out.println("The reversed String is: " + secondString);
                    break;
                case 3:
                    System.out.println("Concatenate two Strings");
                    System.out.println("Enter first string: ");
                    firstString = myScan.next();
                    System.out.println("\nEnter second string: ");
                    secondString = myScan.next();

                    result = firstString + secondString;

                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("String Comparison");
                    System.out.println("Enter first string: ");
                    firstString = myScan.next();
                    System.out.println("\nEnter second string: ");
                    secondString = myScan.next();

                    if(firstString.equals(secondString)){
                        System.out.println("The entered strings are equal");
                    }else{
                        System.out.println("The entered strings are not equal");
                    }
                    break;
                case 5:
                    System.out.println("Length of a String");
                    System.out.println("Enter a String: ");
                    firstString = myScan.next();

                    int len = firstString.length();
                    System.out.println("The length of the entered string is: " + len);
                    break;
                  default:
                    System.out.println("Invalid choice! Please make a valid choice");
                    break;
            }
            System.out.println("Do you want to continue (type true for yes, false for no): ");
            isFinished = myScan.nextBoolean();
            if(isFinished == true){
                continue;
            } else{
                break;
            }
        }while(true);
    
        myScan.close();
    
    }
}

/*In this program, I start off by creating a scanner instance and jump into the do-while loop
do while loops starts by printing off the menu of options a user can choose from
then we take in user input, and save it to myChoice
also we declare variables that we use during switch cases
Case 1 for palindrome check, we take in user string, set up two pointers, and have them point to the two ends of a string
we check if the two ends are equal, and exit if no equal, if equal then increment/decrement, and continue the loop, 
if string is palindrome the loop finishes quitely, and another if case to print its a palindrome

Case2: take user string from input, and traverse the string from the back, and at each index
we take char at that index and Concatenate it to a new String
at the end, the new string is the reverse of input string

case 3: take user input for two strings, concatenate them, and save to a new variable
then return that variable

case 4: take user input for two strings, use equals() string method in an if statement
and return a string that says its equal if not, opposite otherwise

case 5: take user input for a string, and use length() string method on that string
and return the length
*/