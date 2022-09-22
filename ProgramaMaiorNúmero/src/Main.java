import java.util.Scanner;

// Programa que diz o maior n�mero entre os 3 digitado

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe os 3 n�meros\n");
		
		System.out.print("Digite o primeiro n�mero: ");
		int a = scan.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int b = scan.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		int c = scan.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		scan.close();
	}
	
	//Fun��o para valida��o de qual n�mero � o maior 
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
	
	//Fun��o para imprimir na tela 
	public static void showResult(int value) {
		System.out.println("Maior: " + value);
	}
}
