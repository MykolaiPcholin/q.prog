package first;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(24.50,"book-reeder", 10.0);
		Product product2 = new Product(99.50,"phone", 50.0);
		Product product3 = new Product();
		
		product3.setPrice(17.99);
		product3.setDescription("Default description");
		product3.setAmount(2.5);
		
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		
		System.out.println(product2.getPrice());
		System.out.println(product2.getDescription());
		System.out.println(product2.getAmount());
	}

}
