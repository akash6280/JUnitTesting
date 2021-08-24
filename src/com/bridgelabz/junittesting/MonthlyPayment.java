package com.bridgelabz.junittesting;

public class MonthlyPayment {
	public static void main(String[] args)
	{
		double principal = Double.parseDouble(args[0]);
        double year = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);
        
	    double n = 12 * year;  
        double r = rate/(12*100);
        double monthlyPayment=(principal*r)/(1-Math.pow(1+r,-n));
		
	    System.out.println("payment is " + monthlyPayment);
	}
}
