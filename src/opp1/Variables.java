package opp1;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		int age = sc.nextInt();
		System.out.println("My name is: " + name + ",my age: " + age);
		sc.close();

	}
}