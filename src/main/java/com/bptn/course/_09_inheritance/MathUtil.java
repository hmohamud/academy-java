package com.bptn.course._09_inheritance;

public class MathUtil {
	
	public MathUtil() {
		addCount();
	}
	 
	static int count = 0;
	
	static void addCount() {
		count++;
	}
	
	// static dataType propertyName;
	 static double valueOfPi = 3.14;
	 
	// static returnType methodName;
	 static int add(int a, int b) {
	  return a + b;
	 }
	 
	 public void displayData() {
	  System.out.print("This is not static");
	 }
	 
	 


}