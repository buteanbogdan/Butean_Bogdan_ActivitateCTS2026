public class Produs implements ItemMeniu {
    private String denumire;
    private float pret;

    public Produs(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void adaugaItem(ItemMeniu item) throws Exception {
        throw new Exception("Eroare: Nu se pot adăuga elemente într-un produs simplu!");
    }

    @Override
    public void stergeItem(ItemMeniu item) throws Exception {
        throw new Exception("Eroare: Nu se pot șterge elemente dintr-un produs simplu!");
    }

    @Override
    public ItemMeniu getItem(int index) throws Exception {
        throw new Exception("Eroare: Produsul simplu nu are sub-elemente!");
    }

    @Override
    public void afisareDetalii() {
        System.out.println("    -> Produs: " + denumire + " (Preț: " + pret + " RON)");
    }
}