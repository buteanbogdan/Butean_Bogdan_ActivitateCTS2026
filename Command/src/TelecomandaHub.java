import java.util.ArrayList;
import java.util.List;

public class TelecomandaHub {

    private List<ComandaSmart> istoricComenzi;

    public TelecomandaHub() {
        this.istoricComenzi = new ArrayList<>();
    }


    public void preiaComanda(ComandaSmart comanda) {
        istoricComenzi.add(comanda);
        System.out.println("[TELECOMANDA] O noua comanda a fost adaugata in coada.");
    }


    public void executaToateComenzile() {
        System.out.println("\n--- Se executa " + istoricComenzi.size() + " comenzi programate ---");

        for (ComandaSmart comanda : istoricComenzi) {
            comanda.executa();
        }


        istoricComenzi.clear();
        System.out.println("--- Toate comenzile au fost finalizate ---\n");
    }
}