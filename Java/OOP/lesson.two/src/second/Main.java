package second;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat borisDjonsonjuk = new Cat ("milk, fish, meat, water", "white", 333, "Boris Djonsonjuk", "meow-meow");
		Dog patron = new Dog ("meat, water", "brown", 777, "Patron", "woof-woof");
		
		System.out.println(borisDjonsonjuk);
		System.out.println(patron);
		
		Veterinarian doc = new Veterinarian("Dr. Dolittle");
		doc.treatment(borisDjonsonjuk);
		doc.treatment(patron);
	}
	//
}
