public class Brancardier implements PersonalSpital {
    private String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancardierul " + nume + " transporta un pacient catre sala de operatie.");
    }
}