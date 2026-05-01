import java.util.ArrayList;
import java.util.List;

public abstract class Banca {
    private String numeBanca;
    // Lista in care tinem minte cine s-a abonat
    private List<Abonat> listaAbonati;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.listaAbonati = new ArrayList<>();
    }

    public String getNumeBanca() {
        return numeBanca;
    }

    // Metoda de SUBSCRIBE
    public void adaugaAbonat(Abonat abonat) {
        listaAbonati.add(abonat);
    }

    // Metoda de UNSUBSCRIBE
    public void stergeAbonat(Abonat abonat) {
        listaAbonati.remove(abonat);
    }

    public void notificaAbonati(String mesaj) {
        for (Abonat abonat : listaAbonati) {
            abonat.primesteMesaj(mesaj);
        }
    }
}