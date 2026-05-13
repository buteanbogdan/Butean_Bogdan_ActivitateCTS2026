public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Curierat (Template Method) ---\n");


        System.out.println("--- Comanda 1: Livrare Locala ---");
        ProcesLivrare comandaBucuresti = new LivrareLocala("Strada Victoriei nr. 10");

        comandaBucuresti.executaLivrare();

        System.out.println("\n--------------------------------------------------\n");


        System.out.println("--- Comanda 2: Livrare Internationala ---");
        ProcesLivrare comandaGermania = new LivrareInternationala("Germania, Berlin");

        comandaGermania.executaLivrare();
    }
}