package third;

public class First {

	public static void main(String[] args) {
		// this program will find max of four numbers
		int first = 400;
		int second = 2400;
		int third = 50;
		int fourth = 4220;
		int maxNumber;
		
		maxNumber = first;
		if (second > maxNumber) {
			maxNumber = second;
		}
		if (third > maxNumber) {
			maxNumber = third;
		}
		if (fourth > maxNumber){
			maxNumber = fourth;
		}
		
		System.out.println("Max number of array numbers is: " + maxNumber);
	}

}
