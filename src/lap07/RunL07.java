package lap07;

public class RunL07 {
    public static void main(String[] args) {
        System.out.println("Run lap07");

        SinhVienL07 it1 = new SinhVienITL07(10, 7);
        System.out.println("Sinh Vien it1 score = " + it1.getScore());
        SinhVienL07 cokhi1 = new SinhVienCoKhiL07(6, 8);
        System.out.println("Sinh Vien cokhi1 score = " + cokhi1.getScore());
    }

}