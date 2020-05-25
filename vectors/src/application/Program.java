package application;

import java.util.Scanner;

import product.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.print("Informe a quantidade de produtos: ");
		int n = sc.nextInt();
		
		//declara��o do vetor do tipo da classe Product
		Product[] vect = new Product[n];
		
		//instanciar os produtos
		System.out.println("Informe nome e pre�o:");
		for (int i = 0; i < vect.length; i ++){
			sc.nextLine(); //necess�rio para consumir o nextInt()
			System.out.print("\nName: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			//instanciar os produtos
			vect[i] = new Product(name, price);
			
			//m�dia dos pre�os
			soma += vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Media de pre�o: %.2f%n", media);
		
		sc.close();
	}

}
