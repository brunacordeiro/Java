import java.util.Scanner;

public class estruturaFor {

	public static void main(String[] args) {
		// Usado quando se sabe a quantidade de valores
		// for (inicio; condi��o; incremento){}

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println("Soma: " + soma);
		sc.close();
	}

}
