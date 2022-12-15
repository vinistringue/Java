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
		 * //Remover um elemento da lista através do valor ou nome list.remove("Karol");
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
		System.out.println("Índice do Bob:  " + list.indexOf("Bob"));

		// Senão tiver o nome indicará um número negativo (-1)
		System.out.println("Índice do Marco: " + list.indexOf("Marco"));

		// Aparecer apenas nomes com a letra que for informado no parâmetro
		System.out.println("--------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		// Imprimir primeiro nome encontrado com o parâmetro passado
		System.out.println("--------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
