package application;

import java.util.Scanner;

import retangulo.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
			
		System.out.print("Valor da Base: ");
		retangulo.base = sc.nextDouble();
		
		System.out.print("Valor da Altura:");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("�rea: " + retangulo.area());
		System.out.println("Per�metro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		
		sc.close();
	}

}
