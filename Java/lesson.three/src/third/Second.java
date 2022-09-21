package third;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// this program will find number of entrance and floor from the flat number entered by the user
	
		System.out.println("Please enter your flat number below to find it");
		Scanner scan = new Scanner(System.in);
		int flatNumber = scan.nextInt();
		double entrance;
		double floor;
		
		if (flatNumber <= 0) {
			System.out.println("Your write wrong flat number. \nPlease enter your flat number below to find it");
		} else if (flatNumber <= 180) {
			entrance = Math.ceil(flatNumber / 36.0);
			floor = Math.ceil((flatNumber - ((entrance - 1) * 36)) / 4);
			System.out.println("Your flat is in " + entrance + " entrance, on the " + floor + "'th floor.");
		} else {
			System.out.println("Hmmm..Maybe your flat in another building?");
			System.out.println(flatNumber);
		}
		scan.close();
	}

}
