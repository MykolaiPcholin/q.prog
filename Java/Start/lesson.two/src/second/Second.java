package second;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// this program will calculates the cost of purchase costs, based on the cost and quantity of the item
		
		double appleCosts = 2.0;
		int appleCount;
		Scanner scan = new Scanner(System.in);
		System.out.println("One apple costs: " + appleCosts + " dollars \nEnter please how many apples do you need:");
		appleCount = scan.nextInt();
		scan.close();
		double usersMoneyTake = appleCosts * appleCount; 
		System.out.println("You should to pay " + usersMoneyTake + " dollars for your apples.\nThank you and have a nice day! :)");
	}

}
