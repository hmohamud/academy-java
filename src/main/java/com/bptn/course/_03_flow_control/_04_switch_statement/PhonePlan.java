package com.bptn.course._03_flow_control._04_switch_statement;
import java.util.Scanner;


public class PhonePlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please choose a mobile data plan.");
		System.out.println("Enter the number corresponding with your choice:");
		System.out.println("1. $10 for 1GB");
		System.out.println("2. $30 for 5GB");
		System.out.println("3. $50 for 10GB");
		System.out.println("4. $70 for Unlimited data");
		System.out.println("5. Exit");
		
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		
		switch(userInput) {
		case 1:
			System.out.println("You have selected the 1GB plan");
			System.out.println("Total cost of your selected plan is $10");
			break;
		case 2:
			System.out.println("You have selected the 5GB plan");
			System.out.println("Total cost of your selected plan is $30");
			break;
		case 3:
			System.out.println("You have selected the 10GB plan");
			System.out.println("Total cost of your selected plan is $50");
			break;
		case 4:
			System.out.println("You have selected the unlimited plan");
			System.out.println("Total cost of your selected plan is $70");
			break;
		case 5:
			System.out.println("Goodbye");
		}
		

	}

}
