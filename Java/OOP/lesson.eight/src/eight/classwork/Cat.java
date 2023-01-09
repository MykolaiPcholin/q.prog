package eight.classwork;

import java.util.Objects;

public class Cat implements Cloneable{
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
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
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
	    return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public Cat clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Cat) super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	
	
	
}