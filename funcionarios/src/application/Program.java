package application;

import java.util.Scanner;

import funcionario.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe os dados do funcion�rio: ");
		System.out.println("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Sal�rio Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println(funcionario);
		
		System.out.println("Aumento de sal�rio %: ");
		double percent = sc.nextDouble();
		funcionario.aumento(percent);
		
		System.out.println("Update\n " + funcionario);
		
		sc.close();
	}

}
