public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Notificari Bancare (Observer Pattern) ---");


        SucursalaBancara bancaMea = new SucursalaBancara("Banca Nationala");


        Abonat client1 = new ClientBanca("Andrei");
        Abonat client2 = new ClientBanca("Maria");
        Abonat client3 = new ClientBanca("George");


        bancaMea.adaugaAbonat(client1);
        bancaMea.adaugaAbonat(client2);
        bancaMea.adaugaAbonat(client3);


        bancaMea.lanseazaOfertaCredit("Credit de Nevoi Personale cu dobanda 5%");


        System.out.println("\n-> Maria a oprit notificarile din aplicatie.");
        bancaMea.stergeAbonat(client2);


        bancaMea.anuntaMentenanta();
    }
}