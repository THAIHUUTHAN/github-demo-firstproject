package chapter7;

import java.util.ArrayList;

public class RunSinhVien {
	public static void main(String[] args) {
		SinhVienIT Than = new SinhVienIT();
		SinhVienCoKhi Than1 = new SinhVienCoKhi();
		ArrayList<String> language = new ArrayList();
		language.add("C");
		language.add("Java");
		Than.setLanguage(language);
		Than.setId("AT190149");
		Than.setName("Than");
		Than.setPrice(90000);
		Than.setTax(20.0);

		System.out.println(Than.toString() + " PriceTax = " + Than.getPriceTax());

		ArrayList<String> skill = new ArrayList();
		skill.add("Hàn");
		skill.add("Cắt");
		Than1.setSkill(skill);
		Than1.setId("AT190150");
		Than1.setName("Than1");
		Than1.setPrice(80000);
		Than1.setTax(10.0);
		System.out.println(Than1.toString());

	}
}
