package lap08;

public class Student extends Person {
    private double mark;
    private String grade;

    public Student(String id, String name, int age, double mark) {
        super(id, name, age);
        this.mark = mark;
        setGrade(mark);
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(double mark1) {

        if (mark1 >= 8) {
            this.grade = "A";
        } else if (mark1 >= 7) {
            this.grade = "B";
        } else if (mark1 >= 6) {
            this.grade = "C";
        } else if (mark1 >= 5) {
            this.grade = "D";
        } else {
            this.grade = "Tạch CMM";
        }
    }

    @Override
    public String toString() {
        return "Student [mark= " + mark + ", id= " + id + ", grade= " + grade + ", name= " + name + ", age= " + age
                + "]";
    }

}
