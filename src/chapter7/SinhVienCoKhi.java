package chapter7;

import java.util.ArrayList;

public class SinhVienCoKhi extends SinhVien {
	ArrayList<String> skill = new ArrayList();

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
}
