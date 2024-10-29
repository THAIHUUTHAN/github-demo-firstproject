package chapter7;

import java.util.ArrayList;

public class SinhVienIT extends SinhVien {
	ArrayList<String> language = new ArrayList();

	@Override
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

}
