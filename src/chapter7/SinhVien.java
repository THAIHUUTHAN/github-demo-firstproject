package chapter7;

public abstract class SinhVien {
	String id;
	String name;
	double price;
	double tax;

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

//method

	public double getPriceTax() {

		double priceTax = this.price * this.tax;
		return priceTax;
	}

	public void info() {
		System.out.println("Run info from parent ");
	}

	abstract void tinhDiem();

	@Override
	public String toString() {
		return "SinhVien [id = " + id + " name= " + name + " price = " + price + " tax = " + tax + " ]";
	}
}
