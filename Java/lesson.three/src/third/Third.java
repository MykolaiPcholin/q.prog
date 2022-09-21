package third;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// this program will check if the triangle exists
		
		double sideA;
		double sideB;
		double sideC;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first side size below:");
		sideA = scan.nextDouble();
		System.out.println("Enter second side size below:");
		sideB = scan.nextDouble();
		System.out.println("Enter third side size below:");
		sideC = scan.nextDouble();
		
		if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
			System.out.println("The triangle doesn't exist");
		} else if (((sideA + sideB) <= sideC) && ((sideB + sideC) <= sideA) && ((sideA + sideC) <= sideB)) {
			System.out.println("The triangle doesn't exist");
		} else {
			System.out.println("The triangle exist");
		}
		scan.close();
	}

}
