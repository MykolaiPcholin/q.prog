package fourth;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// this program will draw a shape from symbols depending on the entered values
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter width");
		int width = scan.nextInt();
		System.out.println("Enter height");
		int height = scan.nextInt();
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if ((i == 1) || (j == 1) || (i == height) || (j == width)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
