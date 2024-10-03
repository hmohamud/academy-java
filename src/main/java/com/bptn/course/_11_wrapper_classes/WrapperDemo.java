package com.bptn.course._11_wrapper_classes;

public class WrapperDemo {
	   private double temperature;
	   public static double maxTemp = 0;

	   public WrapperDemo(double t) {
	        temperature = t;
	        if (t > maxTemp)
	            maxTemp = t;
	   }

	   public static void main(String[] args) {
	        WrapperDemo t1 = new WrapperDemo(75);
	        WrapperDemo t2 = new WrapperDemo(100);
	        WrapperDemo t3 = new WrapperDemo(65);
	        System.out.println("Max Temp: " + WrapperDemo.maxTemp);
	   }
	 }
