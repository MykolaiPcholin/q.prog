package second;

public class Veterinarian {
	private String name;
	
	public Veterinarian(String name) {
		super();
		this.name = name;
	}
	public Veterinarian() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void treatment(Animal animal) {
		System.out.println("I`m veterinarian " + name + ". I treat a " + animal.toString());
	}
	
	@Override
	public String toString() {
		return "Veterinarian [name=" + name + "]";
	}
}
