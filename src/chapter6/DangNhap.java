package chapter6;

import java.util.Scanner;

public class DangNhap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap ten nguoi dung : ");
			String username = sc.nextLine();
			System.out.println("Nhap mat khau : ");
			String password = sc.nextLine();

			if ((username.equals("than")) && (password.length() >= 6)) {

				System.out.println("Dang nhap thanh cong");
				break;
			}
			System.out.println("Ten nguoi dung hoac mat khau khong hop le!");
		}
		sc.close();

	}
}
