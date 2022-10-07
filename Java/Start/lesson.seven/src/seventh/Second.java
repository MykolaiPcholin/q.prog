package seventh;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// this program will implement the method of drawing a rectangle according to its dimensions
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter width");
		int width = scan.nextInt();
		System.out.println("Enter height");
		int height = scan.nextInt();
		scan.close();
		squareDrawer(width, height);
	}
	public static void squareDrawer (int width, int height) {
		
		
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
		
	}

}
