package chapter7;

import java.util.ArrayList;

public class SinhVienIT extends SinhVien {
	ArrayList<String> language = new ArrayList();

	public SinhVienIT(ArrayList language, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;

	}

	public String toString() {
		return "SinhVien [id = " + id + " name= " + name + " price = " + price + " tax = " + tax + "% language = "
				+ language.toString() + "]";
	}

	public ArrayList<String> getLanguage() {
		return language;
	}

	public void setLanguage(ArrayList<String> language1) {
		this.language = language1;
	}

	public double getPriceTax() {
		return price * tax / 100;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}

}
