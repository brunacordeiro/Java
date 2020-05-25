/*
 * Tamanho da lista: size()
 * Obter o elemento de uma posição: get(position)
 * Inserir elemento na lista: add(obj), add(int, obj)
 * Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
 * Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
 * Filtrar lista com base em predicado: List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
 * Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lists {
	
	public static void main(String[] args) {
	
		//declaração da lista
		List<String> list = new ArrayList<>();

		//inserção de elementos
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//insercção em uma posição específica
		list.add(2, "Marco");
		
		System.out.println(list.size()); //impressão tamanho da lista
		
		//for each
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		//utilização de predicados(lambda)
		list.removeIf(x -> x.charAt(0) == 'M'); //remove todos que começam com M
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		
		// encontrar a posição que está um elemento na lista (-1 sig que não encontrou)
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------");

		//Encontrar os elementos que começam com A
		//não há uma função para encotrar igual tem em removerIf...
		//stream() é utilizado para encontrar as coisas uzando predicados
		//não é compativel com o tipo list, então em usar o collect e o toList para converter
		List<String> result = list.stream().
				filter(x -> x.charAt(0) == 'A').
				collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//encontrar o primeiro elemento que começa com a letra 'A'
		//o resultado será impresso na tela
		//para isso usa o findFirst() que pertence ao Java 8 para frente
		//ele retorna um Opition por isso tenho que adicionar o orElse 
		//se o elemento não existir o retorno é nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'A').
				findFirst().orElse(null);
		System.out.println(name);
	}
}