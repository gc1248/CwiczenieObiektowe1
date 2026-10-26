public class CwiczenieObiektowe_1 {
    public static void main(String[] args) {

        MojeDane dane = new MojeDane("Jan", "Kowalski", "3P");
        System.out.println("Moje dane:");
        System.out.println("Imie: " + dane.getImie());
        System.out.println("Nazwisko: " +dane.getNazwisko());
        System.out.println("Klasa: " + dane.getKlasa());


        Logowanie logowanie = new Logowanie("login", "123abc");
        System.out.println("\nLogowanie:");
        System.out.println(logowanie.toString());


        Kolo k1 = new Kolo(4);
        Kolo k2 = new Kolo(20);
        System.out.println("\nKolo 1:");
        System.out.println("Pole: " + k1.poleKola());
        System.out.println("Obwod: "+ k1.obwodKola());

        System.out.println("Kolo 2: ");
        System.out.println("Pole: " + k2.poleKola());
        System.out.println("Obwod: " + k2.obwodKola());


        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println("\nPole kwadratu: " + kwadrat.poleKwadratu());
        System.out.println("Obwod kwadratu: " + kwadrat.obwodKwadratu());

        Prostokat prostokat = new Prostokat(10, 5);
        System.out.println("\nPole prostokata: " + prostokat.poleProstokat());
        System.out.println("Obwod prostokat: " + prostokat.obwodProstokat());



    }
}