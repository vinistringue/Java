package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product (String name, double price, int quantity) {
		//This � utilizado para chamar o objeto
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product (String name, double price) {
		//This � utilizado para chamar o objeto
		this.name = name;
		this.price = price;
		//quantity ser� iniciado por 0 padrao java 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity () {
		return quantity;
	}
	
	public double totalValueInStock () {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString () {
		return name
			+ ", $ " + String.format("%.2f", price)
			+ ", " + quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
