package chapter9;

import java.util.Scanner;

public class Video53 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            try {
                int x = sc.nextInt();
                System.out.println("run try ");
            } catch (Exception e) {

                System.out.println("run task ");
            } finally {
                System.out.println("run finally");
                sc.close();
            }
        }

    }
}
