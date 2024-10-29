package chapter5;

import java.util.ArrayList;

import oop2.Student;

public class ArrayList1 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList a2 = new ArrayList();

		ArrayList<String> a1 = new ArrayList(); // generic
		ArrayList<Student> a3 = new ArrayList<Student>(); // generic
		a1.add("Than day");
		a1.add("Than day 2");
		a1.remove(1);
		System.out.println(a1.toString() + " " + a1.size());
		System.out.println(a1.get(0));

	}
}