public class MojeDane{
    private String imie;
    private String nazwisko;
    private String klasa;

    public MojeDane(String imie, String nazwisko, String klasa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getKlasa(){
        return klasa;
    }
}
