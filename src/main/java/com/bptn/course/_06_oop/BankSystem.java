package com.bptn.course._06_oop;

class BankSystem {

	public static void main(String[] args) {
		
//		BankAccount myAccount = new BankAccount("987654", 1200.00);
//		
//		firstAccount.displayAccountInfo();
//		
//		BankAccount testAccount = new BankAccount("123456", 600.00);
//		testAccount.displayAccountInfo();
		
		SavingsAccount myAccount = new SavingsAccount("Savings123", 500.00, 1.00);
		myAccount.applyInterest();
		myAccount.displayAccountInfo();
		
		CheckingAccount personalAccount = new CheckingAccount("1234", 500, 300);
		personalAccount.withdraw(300);
		personalAccount.displayAccountInfo();

	}

}
