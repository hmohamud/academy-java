package com.bptn.course._06_oop;

public class BankAccount {
	
	//Data Members / Properties
	private String accountNumber;
	private double balance;
			
	//Constructor
	public BankAccount(String accountNumber, double initialBalance) {
	this.accountNumber = accountNumber;
	this.balance = initialBalance;
	}
	
	//instance method / class method
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
	
	//getter and setter
	public double getBalance() {
		return balance;
	}
	
	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
	}
	
}
