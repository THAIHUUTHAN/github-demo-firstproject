package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapDayinTong {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> a = new ArrayList();
		System.out.println("Nhap phan tu dau tien cua day : ");
		double S = 0;

		while (true) {
			double x = sc.nextDouble();
			a.add(x);
			System.out.println("Nhap them y/n : ");
			if (sc.nextLine().equals("y")) {
				continue;
			}
			if (sc.nextLine().equals("n")) {
				break;
			}
			System.out.println("Nhap phan tu tiep theo : ");
		}

		for (int i = 0; i < a.size(); i++) {
			S += a.get(i);
		}
		System.out.println("Day da nhap : " + a);
		System.out.println("Tong cua day vua nhap la : " + S);
	}
}
