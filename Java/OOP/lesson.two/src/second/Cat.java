package second;

public class Cat extends Animal{
	private String name;
	private String voice;
	
	public Cat(String ration, String color, int weight, String name, String voice) {
		super(ration, color, weight, voice);
		this.name = name;
		this.voice = voice;
	}
	
	public Cat () {
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
		System.out.println("Cat " + name + " is eating");
	}
	public void sleep() {
		System.out.println("Cat " + name + " is eating");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "; voice=" + voice + "] " + super.toString();
	}
	
	
	
}