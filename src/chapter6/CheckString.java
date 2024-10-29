package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("0\\d{11}");
		Matcher matcher = pattern.matcher("012345678999");
		System.out.println("SO DIEN THOAI : " + matcher.matches());

		Pattern pattern2 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0_9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher2 = pattern2.matcher("Thanthai0203@gmail.com");
		System.out.println("GMAIL : " + matcher2.matches());

	}
}
