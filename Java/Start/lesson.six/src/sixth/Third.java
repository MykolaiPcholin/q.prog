package sixth;

public class Third {

	public static void main(String[] args) {
		// this program will print the value of pi up to a certain sign
		
		int count = 2;
		
		for (int i = 1; i < 11; i++) {
			String result = String.format("%." + count +"f", Math.PI);
			if (i < 10) {
				System.out.println("String №  " + i + ". " + result);
				count++;
			}
			if (i == 10) {
				System.out.println("String № " + i + ". " + result);
			}
		}
		
	}
	
}
