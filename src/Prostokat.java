public class Prostokat {
    private double szerokosc;
    private double dlugosc;

    public Prostokat(double szerokosc, double dlugosc){
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }

    public double poleProstokat(){
        return szerokosc * dlugosc;
    }

    public double obwodProstokat(){
        return 2 * (szerokosc + dlugosc);
    }
}
