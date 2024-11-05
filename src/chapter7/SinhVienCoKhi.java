package chapter7;

import java.util.ArrayList;

public class SinhVienCoKhi extends SinhVien {
	ArrayList<String> skill = new ArrayList();

	public SinhVienCoKhi(ArrayList skill, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.skill = skill;

	}

	@Override
	public String toString() {
		return "SinhVien [id = " + id + " name= " + name + " price = " + price + " tax = " + tax + "% skill = "
				+ skill.toString() + "]";
	}

	public ArrayList<String> getSkill() {
		return skill;
	}

	public void setSkill(ArrayList<String> skill1) {
		this.skill = skill1;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}
