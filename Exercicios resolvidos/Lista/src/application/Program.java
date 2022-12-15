package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Marco");
		list.add("Bob");
		list.add(2, "Anna");

		// Mostrando o tamanho da lista
		System.out.println("Quantidade de nome na lista: " + list.size());
		System.out.println();

		/*
		 * //Remover um elemento da lista atrav�s do valor ou nome list.remove("Karol");
		 * 
		 * //Remover um elemento da lista a partir do indice list.remove(1);
		 */

		// Usando for each pra percorrer a lista
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------------------");
		// Removendo por predicado, escolhendo uma letra
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------------------");
		System.out.println("�ndice do Bob:  " + list.indexOf("Bob"));

		// Sen�o tiver o nome indicar� um n�mero negativo (-1)
		System.out.println("�ndice do Marco: " + list.indexOf("Marco"));

		// Aparecer apenas nomes com a letra que for informado no par�metro
		System.out.println("--------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		// Imprimir primeiro nome encontrado com o par�metro passado
		System.out.println("--------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
