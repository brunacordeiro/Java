package application;

import java.util.Scanner;

import room.Registration;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, email;
		
		Registration[] reg = new Registration[10];
		
		System.out.println("Quantidade de estudantes: ");
		int n = sc.nextInt();
		
		//registro do aluguel para n estudantes
		
		for (int i = 0; i < n; i++){
			sc.nextLine();
			System.out.println("Nome: ");
			name = sc.nextLine();
			
			System.out.println("E-mail:");
			email = sc.nextLine();
			
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			
			reg[quarto] = new Registration(name, email);
		}
		

		System.out.println("Quartos ocupados:");
		for (int j = 0; j < 10; j++){
			if (reg[j] != null){
			System.out.println(j + ": " + reg[j].getName());
			}
		}
		
		sc.close();
	}
}
