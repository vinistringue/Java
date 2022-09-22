package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		
		System.out.print ("WIDTH: ");
		rect.width = scan.nextDouble();
		System.out.print ("HEIGHT: ");
		rect.height = scan.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf ("DIAGONAL = %2f%n", rect.diagonal());
	}

}
