package com.bptn.course._05_strings;

import java.util.Scanner;


public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scan.nextLine();
		
		short vowelCount = 0;
		short constCount = 0;
		
		String lowerCaseInput = input.toLowerCase();
		
		for(int i = 0; i < lowerCaseInput.length(); i++) {
			char ch = lowerCaseInput.charAt(i);
			
		
			if(ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch=='u') {
				vowelCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				constCount++;
			}
		}
		
		System.out.println("Number of vowels are: " + vowelCount);
		System.out.println("Number of constanant are: " + constCount);
		

	}

}
