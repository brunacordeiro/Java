import java.util.Scanner;

public class enquanto {

	public static void main(String[] args) {
		// Estrutura condicional While - a diferen�a do if e que ele volta

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); // faz a leitura do primeiro valor antes de entrar
								// no while
		int soma = 0;

		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println("A soma �: " + soma);
		sc.close();
	}
}