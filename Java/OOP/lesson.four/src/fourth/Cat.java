package fourth;

public class Cat implements Comparable {
	private String name;
	private int age;

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Cat cat1 = (Cat) o;

		if (name.length() > cat1.name.length()) {
			return 1;
		}

		if (name.length() < cat1.name.length()) {
			return -1;
		}
		return 0;
	}

}
