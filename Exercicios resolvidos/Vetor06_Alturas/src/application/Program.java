package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" ---- JAVA VETOR ALTURAS ---- ");

		int n, nmenores;
		double alturaTotal, alturaMedia, percentualMenores;

		System.out.print("\nQuantas pessoas serão digitadas? ");
		n = scan.nextInt();

		String nome[] = new String[n];
		int idade[] = new int[n];
		double alturas[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("\nDados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = scan.next();
			System.out.print("Idade: ");
			idade[i] = scan.nextInt();
			System.out.print("Altura: ");
			alturas[i] = scan.nextDouble();
		}

		alturaTotal = 0.0;
		nmenores = 0;

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				nmenores++;
			}

			alturaTotal += alturas[i];
		}

		alturaMedia = alturaTotal / n;
		percentualMenores = ((double) nmenores / n) * 100.0;

		System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		scan.close();
	}
}
