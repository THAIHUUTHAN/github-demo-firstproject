package lap07;

public class SinhVienITL07 extends SinhVienL07 {
    private double scoreJava;
    private double scoreHTML;

    public SinhVienITL07(double scoreJava, double scoreHTML) {
        super();
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    @Override
    double getScore() {

        return (this.scoreJava * 2 + this.scoreHTML) / 3; // TODO Auto-generated method stub
    }

}