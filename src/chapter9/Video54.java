package chapter9;

import java.util.Scanner;

public class Video54 {

    public static int nhapId() {
        int result;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap id : ");
            try {
                result = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ma id k hop le ! Nhap vao so nguyen : ");
                sc.next();
            }
        }
        sc.close();
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int id = nhapId();
            Student st1 = new Student(id, "THAI", 9, 21);
            System.out.println("info  : " + st1);
        }

    }
}
