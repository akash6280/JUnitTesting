package com.bridgelabz.junittesting;
import java.util.Scanner;
public class SquareRoot {
	public static void sqrt(double c) {
		double t = c;
		double epsilon = 1.0e-15;
		while (Math.abs(t - c / t) > epsilon * t) 
		{
			t = ((c/t)+t) / 2.0;
		}

		System.out.print("Square root of " + c + " is " + t);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find square root");
		double c=sc.nextDouble();
		sqrt(c);
		sc.close();
	}

}
