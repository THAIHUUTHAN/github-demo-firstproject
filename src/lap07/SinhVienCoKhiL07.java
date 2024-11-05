package lap07;

public class SinhVienCoKhiL07 extends SinhVienL07 {
    private double scoreCNC;
    private double scorePLC;

    public SinhVienCoKhiL07(double scoreCNC, double scorePLC) {
        super();
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }

    @Override
    double getScore() {
        return (this.scoreCNC + this.scorePLC) / 2;

    }

}