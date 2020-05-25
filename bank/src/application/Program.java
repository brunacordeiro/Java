package application;

import java.util.Scanner;

import account.AccountMovement;
import account.AccountRegistration;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double auxSaque;
		int auxDeposit;
		
		
		System.out.print("Nome do titular da conta: ");
		String name = sc.nextLine();
		System.out.print("N�mero da conta: ");
		int account = sc.nextInt();
		
		AccountRegistration reg = new AccountRegistration(name, account);
		AccountMovement acMov = new AccountMovement();
		
		System.out.println("Deseja realizar deposito: 1 = sim ou 2 = n�o");
		auxDeposit = sc.nextInt();
		acMov.Deposit(auxDeposit);
		
		System.out.println("\n" + reg + "\n" + acMov);
		
		System.out.println("\n1 - Alterar nome");
		System.out.println("2 - Depositar");
		System.out.println("3 - Saque");
		System.out.println("\nInforme a op��o desejada:");
		int auxOp = sc.nextInt();
		
		switch (auxOp){
			
		case 1:
			name = "Novo Nome";
			reg.setName(name);
			break;
		case 2:
			System.out.print("Deseja realizar deposito: 1 = sim ou 2 = n�o");
			auxDeposit = sc.nextInt();
			acMov.Deposit(auxDeposit);
		case 3: 
			System.out.print("Valor do Saque: ");
			auxSaque = sc.nextDouble();
			acMov.Withdraw(auxSaque);
			break;
		}
		
		System.out.println(reg + "\n" + acMov);
		sc.close();
	}

}
