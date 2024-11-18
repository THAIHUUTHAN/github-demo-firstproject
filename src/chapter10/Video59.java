package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Video59 {
    public static void main(String[] args) throws IOException {
        System.out.println("Run Video59!");
        FileInputStream in = null;

        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("ouput.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}