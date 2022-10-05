package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n, posMaior;
		double maior;

		System.out.println(" ---- JAVA VETOR MAIOR POSIÇÃO ---- \n");
		System.out.print("Quantos números você vai digitar? ");
		n = scan.nextInt();

		double vetor[] = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("\nDigite um número: ");
			vetor[i] = scan.nextDouble();

		}

		maior = vetor[0];
		posMaior = 0;

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

		scan.close();
	}

}
