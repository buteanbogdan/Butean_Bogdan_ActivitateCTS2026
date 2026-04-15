import java.util.ArrayList;
import java.util.List;

public class Categorie implements ItemMeniu {
    private String numeCategorie;

    private List<ItemMeniu> elementeMeniu;

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
        this.elementeMeniu = new ArrayList<>();
    }

    @Override
    public void adaugaItem(ItemMeniu item) {
        elementeMeniu.add(item);
    }

    @Override
    public void stergeItem(ItemMeniu item) {
        elementeMeniu.remove(item);
    }

    @Override
    public ItemMeniu getItem(int index) {
        if (index >= 0 && index < elementeMeniu.size()) {
            return elementeMeniu.get(index);
        }
        return null;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("\n=== CATEGORIE: " + numeCategorie + " ===");


        for (ItemMeniu item : elementeMeniu) {
            item.afisareDetalii();
        }
    }
}