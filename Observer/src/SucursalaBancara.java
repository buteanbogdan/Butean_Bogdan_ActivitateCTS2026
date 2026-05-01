public class SucursalaBancara extends Banca {

    public SucursalaBancara(String numeBanca) {
        super(numeBanca);
    }

    // Actiune 1: Oferta noua
    public void lanseazaOfertaCredit(String tipCredit) {
        System.out.println("\n[SISTEM " + super.getNumeBanca() + "] Se genereaza campania pentru: " + tipCredit);

        String mesaj = "Avem o oferta noua la " + super.getNumeBanca() + " pentru " + tipCredit + "! Te asteptam in sucursala.";
        super.notificaAbonati(mesaj);
    }

    public void anuntaMentenanta() {
        System.out.println("\n[SISTEM " + super.getNumeBanca() + "] Se pregateste oprirea serverelor...");

        String mesaj = "Atentie! Aplicatia mobila va fi indisponibila la noapte pentru mentenanta.";
        super.notificaAbonati(mesaj);
    }
}