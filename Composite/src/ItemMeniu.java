public interface ItemMeniu {

    void adaugaItem(ItemMeniu item) throws Exception;
    void stergeItem(ItemMeniu item) throws Exception;
    ItemMeniu getItem(int index) throws Exception;

    void afisareDetalii();
}