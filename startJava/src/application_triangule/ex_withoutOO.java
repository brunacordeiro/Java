package application_triangule;

import java.util.Scanner;

public class ex_withoutOO {

	public static void main(String[] args) {
		// Exemplo de calculo de área de triangulo sem utilização de OO
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valores triangulo X");
		System.out.print("Lado A: ");
		double xA = sc.nextDouble();
		System.out.print("Lado B: ");
		double xB = sc.nextDouble();
		System.out.print("Lado C: ");
		double xC = sc.nextDouble();
		
		System.out.println("Valores triangulo Y");
		System.out.print("Lado A: ");
		double yA = sc.nextDouble();
		System.out.print("Lado B: ");
		double yB = sc.nextDouble();
		System.out.print("Lado C: ");
		double yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA)*(p - xB)*(p - xC));
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA)*(p - yB)*(p - yC));

		System.out.printf("Triangulo X: %.4f%n", areaX);
		System.out.printf("Triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY){
			System.out.println("Triangulo X tem a maior área");
		}
		else{
			System.out.println("Triangulo Y tem a maior área");
		}
		
		sc.close();
	}

}
