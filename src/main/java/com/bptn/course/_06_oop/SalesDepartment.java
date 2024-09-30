package com.bptn.course._06_oop;

class SalesDepartment extends Department{
	
	private double totalSalesAmount;
	
	public SalesDepartment(String departmentName, int numOfEmployees, double totalSalesAmount) {
		super(departmentName, numOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
	}

	
	

}
