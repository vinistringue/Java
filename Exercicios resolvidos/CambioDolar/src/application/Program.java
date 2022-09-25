package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" --- C�MBIO D�LAR ---\n\n");
		
		//Usu�rio inserir o pre�o do d�lar
		System.out.print("What is the dollar price?");
		double dollar = scan.nextDouble();
		
		//Usu�rio inserir quantos dolar quer comprar 
		System.out.print("\nHow many dollars we be bought?");
		int qntDollar = scan.nextInt();
		
		double c = CurrencyConverter.calculator(dollar, qntDollar);
		
		System.out.printf("\nAmount to be paid in reais: ");
		System.out.print(c);
		
		

	}

}
