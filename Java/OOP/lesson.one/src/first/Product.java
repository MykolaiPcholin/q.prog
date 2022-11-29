package first;

public class Product {
	private double price;
	private String description;
	private double amount;

	public Product(double price, String description, double amount) {
		super();
		this.price = price;
		this.description = description;
		this.amount = amount;
	}

	public Product() {
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String toString() {
		return "Product [price=" + price + ", description=" + description + ", weight=" + amount + "]";
	}
	
}
