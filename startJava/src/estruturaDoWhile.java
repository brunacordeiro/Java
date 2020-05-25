import java.util.Scanner;

public class estruturaDoWhile {

	public static void main(String[] args) {
		// A condi��o Do While executa uma vez primeiro
		// testa a condi��o depois de executar pelo menos uma vez

		Scanner sc = new Scanner(System.in);

		char resposta;

		do {
			System.out.print("Temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = (9 * C) / (5) + 32;
			System.out.printf("Fahrenheint: %.1f%n", F);
			System.out.print("Informar outro valor? (s/n)");
			resposta = sc.next().charAt(0);

		} while (resposta != 'n');

		System.out.println("Fim de programa!");
		sc.close();
	}
}
