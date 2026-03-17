
public class Main {
    public static void main(String[] args) {

        System.out.println("--- Testare Builder Rezervare Restaurant ---");
        RezervareRestaurant rezervareCuplu = new RezervareRestaurantBuilder()
                .setAsezareLaGeam(true)
                .setDecoratieRomantica(true)
                .setMuzicaLive(true)
                .build();

        System.out.println("Rezervare 1 (Cuplu):");
        System.out.println(rezervareCuplu);
        System.out.println("--------------------------------------------------");

        RezervareRestaurant rezervareFamilie = new RezervareRestaurantBuilder()
                .setScaunCopil(true)
                .setMeniuVegan(true)
                .build();

        System.out.println("Rezervare 2 (Familie):");
        System.out.println(rezervareFamilie);
        System.out.println("--------------------------------------------------");

        RezervareRestaurant rezervareSimpla = new RezervareRestaurantBuilder()
                .build();

        System.out.println("Rezervare 3 (Standard):");
        System.out.println(rezervareSimpla);
    }
}