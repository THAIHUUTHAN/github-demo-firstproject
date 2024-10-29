package oop2;

public class Student {

	// class attributes
	private String name;
	private int age;

	public Student() {

	}

	public Student(String name1, int age1) {
		this.name = name1;
		this.age = age1;
	}

	public String getName() { // getter
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name1) { // setter
		this.name = name1;
	}

	public void setAge(int age1) {
		this.age = age1;
	}

	// class method
	void learnJava() {
		System.out.println("Learn OOP với tht");
	}

	// function overloading
	void learnJava(int a) {
		System.out.println("Learn OOP với tht");
	}
}
