package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = scan.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = scan.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = scan.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = scan.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		scan.close();

	}

}
