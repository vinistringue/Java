package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n, qntdPares;

		System.out.println(" ---- JAVA VETOR N�MEROS PARES ---- \n");

		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = scan.nextInt();

		int vetor[] = new int[n];

		// Armazenando valores nas posi��es/�ndices do vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("\nDigite um n�mero: ");
			vetor[i] = scan.nextInt();
		}

		System.out.println("\nN�MEROS PARES: ");

		qntdPares = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d  ", vetor[i]);
				qntdPares++;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qntdPares);

		scan.close();
	}

}
