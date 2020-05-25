package funcionario;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido(){
		return salarioBruto - imposto;
	}
	
	public void aumento(double percent){
		this.salarioBruto = (salarioBruto * percent/100) + salarioBruto;
		salarioLiquido();
	}
	
	public String toString(){
		return "Funcionário: " + nome 
				+ " Salário Líquido: $" + salarioLiquido();
	}
}
