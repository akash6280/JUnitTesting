package com.bridgelabz.junittesting;
import java.util.Scanner;
public class TemperatureTransformation {
	   public static void temperaturConversion() {

		System.out.print("Enter 1 To convert from Celsius to Fahrenheit 2 To convert Fahrenheit to Celsius");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		System.out.print("Enter temperature value: ");
		double temperature = sc.nextDouble();

		if(option==1) {
			double toFahrenheit = ((temperature * 9) / 5) + 32;
			System.out.println("Temperature in Fahrenheit is " + toFahrenheit);
		}
			
		else {
			double toCelsius = ((temperature - 32) * 5) / 9;
			System.out.println("Temperature in Celsius is " + toCelsius);
		}
		sc.close();
	   
	}

	public static void main(String[] args) {
		temperaturConversion();
	}

}
