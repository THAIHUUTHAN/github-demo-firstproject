package opp1;

import java.util.Scanner;

public class giaipt {

	public static void ptbacnhat() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
		System.out.println("Giải pt bậc nhất");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào biến bậc nhất a = ");
		float a = sc.nextFloat();
		System.out.println("Nhập vào biến bậc không b = ");
		float b = sc.nextFloat();
		System.out.printf("Giải phương trình bậc nhất %fx +%f =0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình không có nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm = %5f", x);
		}
		sc.close();
	}

	public static void ptbachai() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
		System.out.println("Giải pt bậc hai");

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào biến bậc hai a: ");
		float a = sc.nextFloat();
		System.out.println("Nhập vào biến bậc nhất b:  ");
		float b = sc.nextFloat();
		System.out.println("Nhập vào biến bậc không c: ");
		float c = sc.nextFloat();
		System.out.printf("Giải phương trình bậc hai %fx^2 +%fx +%f =0 \n", a, b, c);
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình không có nghiệm");
			} else {
				float x = (float) -c / b;
				System.out.printf("Phương trình có nghiệm = %5f", x);
			}
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("PT vô nghiệm");
			}
			if (delta == 0) {
				float x = -b / (2 * a);
				System.out.printf("PT có nghiệm kép x= %.3f", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("PT có 2 nghiệm riêng biệt x1= %.3f , x2=%.3f ", x1, x2);
			}
		}

		sc.close();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">>LỰA CHỌN TÍNH NĂNG<<");
		System.out.println("++-------------------------------++");
		System.out.println("|1.Giải pt bậc nhất\t\t|");
		System.out.println("|2.Giải pt bậc hai\t\t|");
		System.out.println("|3.Kết Thúc\t\t\t|");
		System.out.println("++-------------------------------++");
		int x = sc.nextInt();
		switch (x) {

		case 1: // giai pt bac nhat
			ptbacnhat();
			break;
		case 2: // giai pt bac hai
			ptbachai();
			break;
		default:
			System.out.println(">> CHƯƠNG TRÌNH ĐÃ KẾT THÚC <<");
			System.exit(0);
		}
	}
}
