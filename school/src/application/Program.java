package application;

import java.util.Scanner;

import student.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Dados do aluno");
		System.out.print("Nome: ");
		student.nome = sc.nextLine();
		System.out.println("Notas: ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		student.resultado();
		
		sc.close();
	}

}
