package sanpham;

import java.util.Scanner;

public class Product {
// class attributes
	private String name;
	private double price;
	private double tax;

// class constructor
	public Product() {

	}

	public Product(String name1, double price1, double tax1) {
		this.name = name1;
		this.price = price1;
		this.tax = tax1;
	}

//getter
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public double getTax() {
		return this.tax;
	}

//setter	
	public void setName(String name1) {
		this.name = name1;
	}

	public void setPrice(double price1) {
		this.price = price1;
	}

	public void setTax(double tax1) {
		this.tax = tax1;
	}

// class method
	public Product nhapThongTin1(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;

	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin Obj vao mau sau: ");
		System.out.println("Nhap ten hang: ");
		String name = sc.nextLine();
		setName(name);
		System.out.println("Nhap gia san pham: ");
		double price = sc.nextDouble();
		setPrice(price);
		System.out.println("Nhap pham tram thue cua san pham: ");
		double tax = sc.nextDouble();
		setTax(tax);
		sc.close();
	}

	public void xuatThongTin() {

		System.out.println("San pham " + name + " co gia " + price + " voi " + tax + "% thue, tuong duong voi "
				+ (double) (price * tax / 100));
	}

}
