package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double vtotal() {
		return price * quantity;
	}
	
	public void addprod(int quantity) {
		this.quantity += quantity;
	}
	
	public void remprod(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
				+ ", $ "
				+String.format("%.2f", price)
				+", "
				+quantity
				+", units, Total: $ "
				+String.format("%.2f", vtotal());	
	}

}
