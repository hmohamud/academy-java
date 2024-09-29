package com.bptn.course.big_coding;

import java.util.*;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);
        
        do {

            System.out.println("/..Calculator Menu../");
            System.out.println("Press 1 for addition\nPress 2 for subtraction");
            System.out.println("Press 3 for multiplication\nPress 4 for division");
            System.out.println("Press 5 to square a number\nPress 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");

            int myChoice = myScan.nextInt();
            double firstNum = 0;
            double secondNum = 0;
            double result = 0;
            boolean isFinished = true;

            switch(myChoice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    firstNum = myScan.nextDouble();
                    System.out.print("\nEnter the second number: ");
                    secondNum = myScan.nextDouble();

                    result = firstNum + secondNum;

                    System.out.println("\nThe sum of " + firstNum + " and " + secondNum + " = " + result);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    firstNum = myScan.nextDouble();
                    System.out.print("\nEnter the second number: ");
                    secondNum = myScan.nextDouble();

                    result = firstNum - secondNum;

                    System.out.println("\nThe difference of " + firstNum + " and " + secondNum + " = " + result);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    firstNum = myScan.nextDouble();
                    System.out.print("\nEnter the second number: ");
                    secondNum = myScan.nextDouble();

                    result = firstNum * secondNum;

                    System.out.println("\nThe product of " + firstNum + " and " + secondNum + " = " + result);
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    firstNum = myScan.nextDouble();
                    System.out.print("\nEnter the second number: ");
                    secondNum = myScan.nextDouble();

                    result = firstNum / secondNum;

                    System.out.println("\nDividing " + firstNum + " by " + secondNum + " = " + result);
                    break;
                case 5:
                    System.out.print("Enter the number: ");
                    firstNum = myScan.nextDouble();

                    result = firstNum * firstNum;

                    System.out.println("\nThe square of " + firstNum + " = " + result);
                    break;
                case 6:
                    System.out.print("Enter the number: ");
                    firstNum = myScan.nextDouble();

                    result = Math.sqrt(firstNum);

                    System.out.println("\nThe square root of " + firstNum + " = " + result);
                    break;
                case 7:
                    System.out.print("Enter the first number: ");
                    firstNum = myScan.nextDouble();

                    result = 1 / firstNum ;

                    System.out.println("\nThe reciprocal of " + firstNum + " = " + result);
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



