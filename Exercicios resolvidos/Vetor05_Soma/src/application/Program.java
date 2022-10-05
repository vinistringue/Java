package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" ---- JAVA SOMA VETOR ---- \n");

		System.out.print("Quantos n�meros voc� vai digitar? ");
		int n = scan.nextInt();

		double vetor[] = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("\nDigite um n�mero: ");
			vetor[i] = scan.nextDouble();

		}

		// Somando os n�mero do vetor
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		// Media dos n�meros do vetor
		double media = soma / vetor.length;

		System.out.print("\nVALORES: ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}

		System.out.println("\nSOMA: " + soma);
		System.out.println("M�DIA: " + media);

	}

}
