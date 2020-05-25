package application;

import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int quantity = 0;
		
		System.out.println("Entre com os dados do produto");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantitiy: ");
		quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);	

		System.out.println();
		System.out.println(product.toString());
		
		System.out.println();
		System.out.print("Adicionar unidades: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Update \n" + product);
		
		System.out.println();
		System.out.print("Remover unidades: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Update \n" + product);
		
		sc.close();	
	}

}
