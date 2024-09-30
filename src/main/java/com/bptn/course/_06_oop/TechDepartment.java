package com.bptn.course._06_oop;

class TechDepartment extends Department{
	
	private double totalPurchaseAmount;
	
	public TechDepartment(String departmentName, int numOfEmployees, double totalPurchaseAmount) {
		super(departmentName, numOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

}
