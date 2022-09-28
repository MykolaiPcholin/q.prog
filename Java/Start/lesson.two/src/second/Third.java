package second;

public class Third {

	public static void main(String[] args) {
		// this program will calculates the cost of spending on fuel based on the distance traveled, taking into account the fuel consumption of the car
		
		double fuelCost = 1.2;
		double fuelСonsumption = 8.0;
		double distance = 120.0;
		double isMoneyNeeds = fuelCost * distance / 100 * fuelСonsumption;
		System.out.println("You should to pay " + isMoneyNeeds + " dollars for fuel on your trip");
	}

}
