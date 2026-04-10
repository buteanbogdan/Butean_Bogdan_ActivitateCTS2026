public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Sala de Fitness (Decorator Pattern) ---");


        System.out.println("\nClientul 1 (Standard):");
        AbonamentFitness abonamentSimplu = new AbonamentDeBaza();
        abonamentSimplu.afisareDetalii();


        System.out.println("\nClientul 2 (Cu Antrenor):");

        AbonamentFitness abonamentCuAntrenor = new DecoratorAntrenorPersonal(abonamentSimplu);
        abonamentCuAntrenor.afisareDetalii();


        System.out.println("\nClientul 3 (VIP - Toate optiunile):");

        AbonamentFitness abonamentVIP = new DecoratorAccesPiscina(abonamentCuAntrenor);
        abonamentVIP.afisareDetalii();
    }
}