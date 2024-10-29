package chapter6;

public class Student {
	// class attributes
	private String name;
	private int age;

//constructor
	public Student() {

	}

//Override
	public Student(String name1, int age1) {
		this.age = age1;
		this.name = name1;
	}

//getter
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

//setter
	public void setName(String name1) {
		this.name = name1;
	}

	public void setAge(int age1) {
		this.age = age1;
	}

	// method
	public String getFirstName() {
		String firstName = this.name.substring(0, this.name.indexOf(" "));
		return firstName;
	}

	public String getLastName() {

		String lastName = this.name.substring(this.name.lastIndexOf(" ") + 1);

		return lastName;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
