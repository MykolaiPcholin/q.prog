package first;

public class Second {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle();
		triangle1.setSideA(3.0);
		triangle1.setSideB(4.0);
		triangle1.setSideC(5.0);

		Triangle triangle2 = new Triangle(4.0, 5.0, 6.0);
		
		System.out.println(triangle1.findArea());
		System.out.println(triangle2.findArea());
	}

}
