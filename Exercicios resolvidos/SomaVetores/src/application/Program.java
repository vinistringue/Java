package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);

		int n;

		System.out.println("Quantos valores vai ter cada vetor? ");
		n = imput.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		
		for(int i=0; i<n; i++) {
			a[i] = imput.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for(int i=0; i<n; i++) {
			b[i]= imput.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			c[i]= a[i]+b[i];
		}
		
		System.out.println("Vetor resultante: ");
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d\n", c[i]);
		}
		
		imput.close();
	}

}
