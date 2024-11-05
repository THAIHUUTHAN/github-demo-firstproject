package chapter7;

import java.util.ArrayList;

public class RunSinhVien {
	public static void main(String[] args) {

		ArrayList<String> language = new ArrayList();
		language.add("C");
		language.add("Java");

		ArrayList<String> skill = new ArrayList();
		skill.add("Hàn");
		skill.add("Cắt");

		SinhVienIT Than = new SinhVienIT(null, "AT190149", "Than", 9000, 20);
		SinhVienCoKhi Than1 = new SinhVienCoKhi(null, "AT190150", "Than2", 8000, 10);

		Than.setLanguage(language);
		Than1.setSkill(skill);
		System.out.println(Than.toString() + " PriceTayx = " + Than.getPriceTax());
		System.out.println(Than1.toString());

	}
}
