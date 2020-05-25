/* Nesse programa não pecisei instanciar o objeto na linha 15
 * pois na classe CurrencyConverter so tenho métodos staticos que não precisam
 * ser instanciados no meu programa principal pois possuem valores fixos.. não 
 * serão alterados..
 * */

package application;

import java.util.Scanner;

import calculator.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Calculator calc = new Calculator();
		
		System.out.print("Qual o preço do dolar? ");
		double dolar = sc.nextDouble();
		System.out.print("Reais: ");
		double reais = sc.nextDouble();
		
		System.out.println("Valor em dolares" + CurrencyConverter.Calculator(dolar, reais));
		sc.close();
	}

}
