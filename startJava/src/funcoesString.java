/*
		 * toLowerCase() - transformar para minusculo
		 * toUpperCase() - transformar para maiusculo
		 * trim() - remover espa�os
		 * 
		 * substring(inicio) - recortar uma string
		 * substring(inicio, fim) - recortar inicio e fim
		 * 
		 * replace(char, char) or (string, string) - substituir
		 * 
		 * IndexOf - informa a posi��o da primeira ocorrencia de um valor na string
		 * LastIndexOf - informa a posi��o da ultima ocorrencia de um string
		 * 
		 * str.Split(" ") - recortar a string com base em um operador
		 * *
		 */

public class funcoesString {

	public static void main(String[] args) {

		String original = " abcd EFGH ijKL MNop  ";

		System.out.println("Munuscula: " + '-' + original.toLowerCase() + '-');
		System.out.println("Mai�scula: " + '-' + original.toUpperCase() + '-');

		System.out.println("Removendo espa�os inicio e fim: " + '-' + original.trim() + '-');

		System.out.println("Substring(3): " + '-' + original.substring(3) + '-');
		System.out.println("Substring(3,9): " + '-' + original.substring(3, 9) + '-');

		System.out.println("Replace (char): " + '-' + original.replace('a', '3') + '-');
		System.out.println("Replace (string): " + '-' + original.replace("abc", "321") + '-');

		int index = original.indexOf("bc");
		System.out.println("IndexOf 'bc': " + index);
		System.out.println("lastIndexOf 'p': " + original.lastIndexOf("p"));

		String sp = "Bruna Michelly de Oliveira Silva Cordeiro";
		String[] vect = sp.split(" ");
		System.out.println("\nSplit separador = ' ': \n" + vect[0] + '\n' + vect[1] + '\n' + vect[2] + '\n' + vect[3]
				+ '\n' + vect[4] + '\n' + vect[5]);
	}

}
