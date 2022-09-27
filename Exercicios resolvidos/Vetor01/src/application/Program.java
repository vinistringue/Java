package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); 
		double [] vect = new double[n];			//N ser� o tamanho do vetor no caso
		
		for(int i=0; i<n; i++) {
			vect[i] = scan.nextDouble();		//Inserindo dados pra cada pos do vect
		}
		
		double sum = 0.0;						//Vari�vel sum guarda a soma do vect
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;					//Vari�vel avg guarda a m�dia
		
		System.out.println("AVERAGE HEIGHT: " + avg);
		
		scan.close();
	}

}
