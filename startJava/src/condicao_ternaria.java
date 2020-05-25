public class condicao_ternaria {

	public static void main(String[] args) {
		// Simplifica��o da condi��o if

		double preco = 35;
		double desconto;

		// Exemplo if
		if (preco < 20) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.2;
		}
		System.out.println("Valor do desconto: " + desconto);

		//////////////////////////////////////////

		// Exemplo Condi��o Tern�ria
		// double variavel = (condi��o) ? verdadeiro : falso;

		double desconto2 = (preco < 20) ? preco * 0.1 : preco * 0.5;
		System.out.println("Valor do desconto 2: " + desconto2);
	}

}
