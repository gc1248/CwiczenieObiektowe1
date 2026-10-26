public class Kolo {
    private static final double PI = 3.1415;
    private double promien;

    public Kolo(double promien){
        this.promien = promien;
    }

    public double poleKola(){
        return PI * promien * promien;
    }

    public double obwodKola() {
        return 2 * PI * promien;
    }
}
