package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = imput.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			imput.nextLine();
			String name = imput.nextLine();

			System.out.print("Email: ");
			String email = imput.next();
			System.out.print("Room: ");
			int roomNumber = imput.nextInt();

			vect[roomNumber] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}

		}

		imput.close();

	}

}
