public class Main {
    public static void main(String[] args) {

        System.out.println("--- Sistem Bancar (Facade Pattern) ---");
        ClientBanca client1 = new ClientBanca("Popescu Andrei", "1900505123456");


        System.out.println("\nSe initiaza cererea de credit...");

        boolean creditAprobat = FacadeVerificareCredit.verificaEligibilitateCredit(client1);

        if (creditAprobat) {
            System.out.println("Rezultat: Creditul a fost APROBAT pentru " + client1.getNume() + ".");
        } else {
            System.out.println("Rezultat: Creditul a fost RESPINS.");
        }
    }
}