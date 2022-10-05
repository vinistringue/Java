package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i=0; i<n; i++) {
			scan.nextLine();
			
			System.out.print("\nWhat product name? ");
			String name = scan.nextLine();		//Criando String name pra receber o nome
			
			System.out.print("How much cost? ");
			double price = scan.nextDouble();	//Criando  double price pra receber preço
			
			vect[i] = new Product(name, price);	//Instanciando um produto
			
		}
		
		double sum = 0.0;		//Variável soma
		
		//Linha abaixo faz a soma de todo mundo/produtos
		for(int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n; 		//Avg é a média, recebe a soma e divide por n produtos
		
		System.out.println("\nAVERAGE PRICE: " + avg);
		
		scan.close();

	}

}
