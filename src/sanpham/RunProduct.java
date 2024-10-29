package sanpham;

public class RunProduct {
	public static void main(String[] args) {
		Product pr1 = new Product();
		Product pr2 = new Product("tui xach", 20000, 10);
		Product pr3 = new Product().nhapThongTin1("balo", 200000, 30);
		pr1.nhapThongTin();
		pr1.xuatThongTin();
		pr2.xuatThongTin();
		pr3.xuatThongTin();
	}
}
