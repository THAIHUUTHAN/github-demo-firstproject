package chapter6;

import java.util.ArrayList;
import java.util.Arrays;

public class RunStudent {
	public static void main(String[] args) {

		Student st1 = new Student("Thái Hữu Thân", 20);
		Student st2 = new Student("Nguyễn Hữu Hoàng", 20);
		Student st3 = new Student("Trần Hữu Văn", 20);
		Student st4 = new Student("Nguyễn Thị Lan", 20);
		Student st5 = new Student("Thái Thị Lê", 20);
		ArrayList<chapter6.Student> a = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5));
		System.out.println("Danh sach sinh vien : " + a);

		System.out.println("Có các sinh viên họ Nguyễn là :");
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getFirstName().equals("Nguyễn")) {
				System.out.println(a.get(i).getName());
			}

		}
	}

}
