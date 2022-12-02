package second;

public class Animal {

	private String ration;
	private String color;
	private int weight;
	private String voice;
	
	public Animal (String ration, String color, int weight, String voice) {
		super();
		this.ration = ration;
		this.color = color;
		this.weight = weight;
		this.voice = voice;
	}
	public Animal () {
		super();
	}
	
	public String getRation() {
		return ration;
	}
	public void setRation(String ration) {
		this.ration = ration;
	}
	public String getColor() {
		return ration;
	}
	public void setColor(String color) {
		this.ration = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Animal [ration=" + ration + "; color=" + color + "; weight=" + weight + "]";
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public void eat() {
		System.out.println("Animal is eating food");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	
}
