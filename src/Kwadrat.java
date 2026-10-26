public class Kwadrat {
    private double bok;

    public Kwadrat(double bok){
        this.bok = bok;
    }

    public double poleKwadratu() {
        return bok * bok;
    }

    public double obwodKwadratu(){
        return bok * 4;
    }
}
