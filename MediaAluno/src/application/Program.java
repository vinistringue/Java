package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter data of Student: ");
		
		System.out.print("Name: ");
		student.name = scan.nextLine();
		
		System.out.print("Nota 1: ");
		student.grade1 = scan.nextDouble();
		
		System.out.print("Nota 2: ");
		student.grade2 = scan.nextDouble();
		
		System.out.print("Nota 3: ");
		student.grade3 = scan.nextDouble();
		
		System.out.printf("FINAL GRADE: " + student.finalGrade());
		
		if(student.finalGrade() < 6.0) {
			System.out.println("FAILED");
			System.out.println("MISSING %/2fn POINTS%" + student.missingPoints());
		}
		else {
			System.out.println("\nPASS");
		}
		scan.close();
	}

}
