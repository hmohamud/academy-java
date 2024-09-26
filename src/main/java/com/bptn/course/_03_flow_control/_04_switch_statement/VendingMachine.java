package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		//initialize scanner
		Scanner scan = new Scanner(System.in);
		
		
		//list of variables we use
		float cola = 1.99f;
		float nestea = 2.99f;
		float henrys = 4.99f;
		float twix = 5.99f;
		float milk = 8.99f;
		float lemonade = 10.99f;
		
		float change;
		
		String finalChoice = "";
		
		
		//start loop
		do {
			
			//list of available items
			System.out.println("Items available in vending machine: ");
			System.out.println("A1 - Coca Cola - $" + cola);
			System.out.println("A2 - Nestea - $" + nestea);
			System.out.println("B1 - Oh Henrys - $" + henrys);
			System.out.println("B2 - Twix Chocolate - $" + twix);
			System.out.println("C1 - Chocolate Milk - $" + milk);
			System.out.println("C2 - Lemonande - $" + lemonade);
			
			
			//prompt user to input, type string
			System.out.println("Enter a code corresponding to an item: ");
			String userCode = scan.next();
			
			
			//prompt user for another input, type float
			System.out.println("How much will you pay?");
			System.out.print("$");
			
			//represents cash that user has
			float userCash = scan.nextFloat();
			
			
			//begin switch cases, if and else blocks if user has sufficient cash
			switch(userCode) {
			case "A1":
				if(userCash < cola) {
					System.out.println("Transaction Failed");
					break;
				} else {
					change = userCash - cola;
					System.out.printf("Your change is: $ %.2f \n", change);
					break;
				}
				
			case "A2":
				if(userCash < nestea) {
					System.out.println("Transaction Failed");
					break;
				} else {
					change = userCash - nestea;
					System.out.printf("Your change is: $%.2f \n", change);
					break;
				}
				
			case "B1":
				if(userCash < henrys) {
					System.out.println("Transaction Failed");
					break;
				} else {
					change = userCash - henrys;
					System.out.printf("Your change is: $%.2f \n" , change);
					break;
				}
				
			case "B2":
				if(userCash < twix) {
					System.out.println("Transaction Failed");
					break;
				} else {
					change = userCash - twix;
					System.out.printf("Your change is: $%.2f \n" , change);
					break;
				}
				
			case "C1":
				if(userCash < milk) {
					System.out.println("Transaction Failed");
					break;
				} else {
					change = userCash - milk;
					System.out.printf("Your change is: $%.2f \n" , change);
					break;
				}
				
			case "C2":
				if(userCash < lemonade) {
					System.out.println("Transaction Failed");
					break;
				} else {
					change = userCash - lemonade;
					System.out.printf("Your change is: $%.2f \n" , change);
					break;
				}
			}
			
			//ask user to continue or not
			System.out.println("Do you want to continue? Enter y or n: ");
			finalChoice = scan.next();
		} while (finalChoice.equals("y") || finalChoice.equals("Y"));
		
		//close scanner
		scan.close();

	}

}
