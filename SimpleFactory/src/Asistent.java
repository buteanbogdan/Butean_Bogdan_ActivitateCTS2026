public class Asistent implements PersonalSpital {
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Asistentul " + nume + " recolteaza analize de laborator.");
    }
}