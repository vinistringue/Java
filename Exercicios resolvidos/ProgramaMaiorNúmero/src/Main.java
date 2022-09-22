import java.util.Scanner;

// Programa que diz o maior número entre os 3 digitado

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe os 3 números\n");
		
		System.out.print("Digite o primeiro número: ");
		int a = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int b = scan.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int c = scan.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		scan.close();
	}
	
	//Função para validação de qual número é o maior 
	public static int max (int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux=x;
		}
		else if (y > z) {
			aux=y;
		}
		else {
			aux=z;
		}
		return aux;
	}
	
	//Função para imprimir na tela 
	public static void showResult(int value) {
		System.out.println("Maior: " + value);
	}
}
