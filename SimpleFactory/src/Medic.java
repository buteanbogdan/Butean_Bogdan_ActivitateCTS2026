public class Medic implements PersonalSpital {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicul " + nume + " este in vizita la pacienii.");
    }
}