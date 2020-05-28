package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i ++){
			System.out.println("Dados do funcionario " +i +":");
			
			System.out.print("Terceirado? y/n");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			
			if( ch == 'y'){
				System.out.print("Valor adicional: ");
				double valueAdd = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, valueAdd);
				list.add(emp);
			}else{
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos");
		
		for(Employee emp : list){
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}

}
