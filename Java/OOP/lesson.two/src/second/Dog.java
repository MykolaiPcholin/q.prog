package second;

public class Dog extends Animal{
	private String name;
	private String voice;
	
	public Dog(String ration, String color, int weight, String name, String voice) {
		super(ration, color, weight, voice);
		this.name = name;
		this.voice = voice;
	}
	
	public Dog () {
		super();
	}
	
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	public void eat() {
		System.out.println("Dog " + name + " is eating");
	}
	public void sleep() {
		System.out.println("Dog " + name + " is eating");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "; voice=" + voice + "] " + super.toString();
	}
	
}