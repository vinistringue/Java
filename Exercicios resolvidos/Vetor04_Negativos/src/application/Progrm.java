package application;

import java.util.Scanner;

public class Progrm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = scan.nextInt();
		
		int vetor [] = new int[n];
		
		//Linha abaixo armazena os números no vetor
		for(int i=0; i<vetor.length; i++) {
			System.out.print("\nDigite um número: ");
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("\nNÚMEROS NEGATIVOS: ");
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
	}

}
