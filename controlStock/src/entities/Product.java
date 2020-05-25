/*
 * A classe Product possui um construtor
 * o construtor da classe, al�m de outras coisas, garante que os dados
 * sejam cadastrados, antes do in�cio do programa. Isso garante que n�o 
 * haja variaveis vazias.
 */

package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;

	//Contrutor da classe formato - public NomeDaClasse(parametros){}

	public Product (String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga - quando crio mais de um contrutor, a diferen�a esta nos parametros
	public Product (String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double totalValueInStock(){
		return price * quantity;
	}
	
	public void addProducts(int quantity){
		//this.quantity - utiliza a palavra this para utilizar o atributo da classe e n�o o valor do parametro
		this.quantity += quantity;
	}
	public void removeProducts(int quantity){
		this.quantity -= quantity;
	}
	
	public String toString(){
		return "Product: " + name
				+ ",\nPrice: $" + String.format("%.2f", price)
				+ ",\nQuantity: " + quantity + " units, "
				+ "\nValue in Stock: $" + String.format("%.2f", totalValueInStock());
	}
	
	
}
