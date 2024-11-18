package chapter9;

import java.util.Scanner;

public class Video52 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap x : ");
            try {
                int x = sc.nextInt();
                try {
                    System.out.println("ket qua 10/x = " + 10 / x);
                    break;
                } catch (Exception e) {
                    System.out.println("run x = " + x);
                }

            } catch (Exception e) {
                sc.next();
                System.out.println("run erorr !");
            }
        }
    }
}
