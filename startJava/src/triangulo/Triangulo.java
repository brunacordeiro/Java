/* 
 * a classe triangulo tem 3 atributos
 * s�o publicos pois posso acessar de outro pacote
 * a classe representa melhor o triangulo e possui 3 atributos
 * criar uma fun��o para fazer o calculo da �rea
 * n�o recebe parametros pois so precisa dos valores de a,b e c
 * Cada classe � respons�vel por si mesma.. se tiver algum calculo
 * para ser feito, dever� estar na classe.
 * */

package triangulo;

public class Triangulo {
		
	public double a;
	public double b;
	public double c;
	
	
	public double area(){
		double p = (a + b + c) /2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}
}
