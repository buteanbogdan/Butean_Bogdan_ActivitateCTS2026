public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Gestiune Meniu (Composite Pattern) ---");

        try {

            ItemMeniu meniuPrincipal = new Categorie("Meniul Restaurantului");


            ItemMeniu categorieBauturi = new Categorie("Bauturi");
            ItemMeniu categorieMancare = new Categorie("Preparate Culinare");


            ItemMeniu subCategoriePizza = new Categorie("Pizza la Cuptor");


            ItemMeniu apa = new Produs("Apa Plata", 8.5f);
            ItemMeniu cafea = new Produs("Espresso", 12.0f);

            ItemMeniu supa = new Produs("Supa de Pui", 25.0f);

            ItemMeniu pizzaDiavola = new Produs("Pizza Diavola", 35.0f);
            ItemMeniu pizzaQuattro = new Produs("Pizza Quattro Formaggi", 38.0f);


            categorieBauturi.adaugaItem(apa);
            categorieBauturi.adaugaItem(cafea);


            subCategoriePizza.adaugaItem(pizzaDiavola);
            subCategoriePizza.adaugaItem(pizzaQuattro);


            categorieMancare.adaugaItem(supa);
            categorieMancare.adaugaItem(subCategoriePizza);


            meniuPrincipal.adaugaItem(categorieBauturi);
            meniuPrincipal.adaugaItem(categorieMancare);


            meniuPrincipal.afisareDetalii();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}