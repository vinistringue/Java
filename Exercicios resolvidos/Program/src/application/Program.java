package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = scan.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: " + c);
		System.out.printf("\nVolume: " + v);
		System.out.printf("\nPI value: " + Calculator.PI);
		
		
		
		scan.close();

	}
	
	

}
