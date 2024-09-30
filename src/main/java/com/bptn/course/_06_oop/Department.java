package com.bptn.course._06_oop;

class Department {

	private String departmentName;
	private int numOfEmployees;
	
	public Department(String departmentName, int numOfEmployees) {
		this.departmentName = departmentName;
		this.numOfEmployees = numOfEmployees;
	}
	
	public void showDepartmentInfo() {
		System.out.println("Department Name: " + this.departmentName);
		System.out.println("Number of Employees: " + this.numOfEmployees);
	}

}
