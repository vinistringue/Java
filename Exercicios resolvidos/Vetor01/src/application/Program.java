package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); 
		double [] vect = new double[n];			//N será o tamanho do vetor no caso
		
		for(int i=0; i<n; i++) {
			vect[i] = scan.nextDouble();		//Inserindo dados pra cada pos do vect
		}
		
		double sum = 0.0;						//Variável sum guarda a soma do vect
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;					//Variável avg guarda a média
		
		System.out.println("AVERAGE HEIGHT: " + avg);
		
		scan.close();
	}

}
