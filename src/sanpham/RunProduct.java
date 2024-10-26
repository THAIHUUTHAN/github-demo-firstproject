package sanpham;

public class RunProduct {
	public static void main(String[] args) {
		Product pr1 = new Product();
		Product pr2 = new Product("xip hong", 20000, 10);
		pr1.nhapThongTin();
		pr1.xuatThongTin();
		pr2.xuatThongTin();
	}
}
