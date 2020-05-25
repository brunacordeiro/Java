package workers;

public class EmployeeRegistration {
	
	private int id;
	private String name;
	private double salario;
	
	public EmployeeRegistration(int id, String name, double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public double AumentoSalario(double percent){
		salario += salario * (percent / 100);
		return salario;
	}
	
	public String toString(){
		return "\nId: " + id 
				+ "\nNome: " + name 
				+ "\nSal�rio: " + salario;
	}
	
}
