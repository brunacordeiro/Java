package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import workers.EmployeeRegistration;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeeRegistration> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de funcionários: ");
		int n = sc.nextInt();
				
		for (int i = 0; i < n; i++){
			sc.nextLine();
			
			System.out.print("Id: ");
			int id = sc.nextInt();
		
			while(hasId(list, id)){
				System.out.println("Id ja cadastrado! Tente novamente ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			list.add(new EmployeeRegistration(id, name, salario));
		}

		System.out.println();
		System.out.println("Aumento de salário %");
		System.out.println("Id do funcionário: ");
		int id = sc.nextInt();
		
		EmployeeRegistration buscaId = list.stream().
				filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (buscaId == null){
			System.out.println("Id não cadastrado!");
		}else{
			System.out.println("Informe a porcentagem de aumento: ");
			double percent = sc.nextDouble();
			buscaId.AumentoSalario(percent);
		}
		
		System.out.println();
		System.out.println("Funcionários: ");
		for(EmployeeRegistration obj : list){
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<EmployeeRegistration> list, int id) {
		EmployeeRegistration emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
