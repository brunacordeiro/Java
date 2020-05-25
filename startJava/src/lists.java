/*
 * Tamanho da lista: size()
 * Obter o elemento de uma posi��o: get(position)
 * Inserir elemento na lista: add(obj), add(int, obj)
 * Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
 * Encontrar posi��o de elemento: indexOf(obj), lastIndexOf(obj)
 * Filtrar lista com base em predicado: List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
 * Encontrar primeira ocorr�ncia com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lists {
	
	public static void main(String[] args) {
	
		//declara��o da lista
		List<String> list = new ArrayList<>();

		//inser��o de elementos
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//inserc��o em uma posi��o espec�fica
		list.add(2, "Marco");
		
		System.out.println(list.size()); //impress�o tamanho da lista
		
		//for each
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		//utiliza��o de predicados(lambda)
		list.removeIf(x -> x.charAt(0) == 'M'); //remove todos que come�am com M
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		
		// encontrar a posi��o que est� um elemento na lista (-1 sig que n�o encontrou)
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------");

		//Encontrar os elementos que come�am com A
		//n�o h� uma fun��o para encotrar igual tem em removerIf...
		//stream() � utilizado para encontrar as coisas uzando predicados
		//n�o � compativel com o tipo list, ent�o em usar o collect e o toList para converter
		List<String> result = list.stream().
				filter(x -> x.charAt(0) == 'A').
				collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//encontrar o primeiro elemento que come�a com a letra 'A'
		//o resultado ser� impresso na tela
		//para isso usa o findFirst() que pertence ao Java 8 para frente
		//ele retorna um Opition por isso tenho que adicionar o orElse 
		//se o elemento n�o existir o retorno � nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'A').
				findFirst().orElse(null);
		System.out.println(name);
	}
}