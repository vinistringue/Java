package application;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ---- JAVA VETOR ---- \n");
		
		//Usu�rio inserir o n�mero de produtos
		System.out.print("Digite o n�mero de produtos: ");
		int n = scan.nextInt();
		
		//Linha abaixo: instanciando um produto a partir de n produtos
		Produto [] produto = new Produto[n];	
		
		for(int i=0; i<n; i++) {
			scan.nextLine();
			
			System.out.print("\nQual nome do produto? ");
			String nome = scan.nextLine();		//Criando vari�vel nome
			
			System.out.print("Qual o pre�o do produto: ");
			double preco = scan.nextDouble(); 	//Criando vari�vel preco
			
			produto[i] = new Produto(nome, preco);	//armazenando nome e preco no vetor
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += produto[i].getPreco();
		}
		
		double media = soma/n;		//M�dia receber soma dividido por n produtos
		
		System.out.println("A m�dia do pre�o �: " + media);
		
		scan.close();
	}

}
