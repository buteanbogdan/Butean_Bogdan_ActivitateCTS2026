public class Main {


    public static void procesareComanda(LivrareMagazin sistemLivrare, String produs) {
        sistemLivrare.livreazaProdus(produs);
    }

    public static void main(String[] args) {
        System.out.println("--- Magazin: Sistem de Livrare (Adapter) ---");


        System.out.println("1. Livrare Standard:");
        LivrareMagazin curierPropriu = new LivrareCurierPropriu();
        procesareComanda(curierPropriu, "Telefon Samsung");

        System.out.println("--------------------------------------------------");


        System.out.println("2. Livrare prin Adapter de Obiecte:");
        CompanieLogisticaExterna fedex = new CompanieLogisticaExterna();
        LivrareMagazin adapterObiecte = new AdapterLivrareObiecte(fedex, "București, Str. Victoriei 10");
        procesareComanda(adapterObiecte, "Laptop ASUS");

        System.out.println("--------------------------------------------------");


        System.out.println("3. Livrare prin Adapter de Clase:");
        LivrareMagazin adapterClase = new AdapterLivrareClase("Cluj, Str. Memorandumului 5");
        procesareComanda(adapterClase, "Monitor DELL");
    }
}