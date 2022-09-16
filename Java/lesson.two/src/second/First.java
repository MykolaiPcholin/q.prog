package second;

public class First {

	public static void main(String[] args) {
		// this program will find the area of a triangle given the values of all its sides
		
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
						
		double semiPerimeter = (sideA + sideB + sideC) / 2;
		
		double square = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
		System.out.println("Area of a triangle is " + square);
	}

}
