package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double C, K, F, Re, Ra;
		
		System.out.println(" --- CONVERSOR TEMPERATURA ---\n");
		System.out.print("Informe o valor em C: ");
		
        C = scan.nextDouble();	//Essa linha espera que o usu�rio insira a temperatura

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("A temperatura em Fahrenheit �: " + F);
        System.out.println("A temperatura em Kelvin �: " + K);
        System.out.println("A temperatura em Reaumur �: " + Ra);
        System.out.println("A temperatura em Rankine �: " + Re);

	}

}
