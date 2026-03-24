
public class Main {


    public static void servireClient(FactoryMeniuRestaurant fabrica) {

        Supa supa = fabrica.creareSupa();
        FelPrincipal felPrincipal = fabrica.creareFelPrincipal();

        System.out.println("Se serveste comanda:");
        supa.afisareIngredienteSupa();
        felPrincipal.afisareIngredienteFelPrincipal();
        System.out.println("Pofta buna!\n");
    }

    public static void main(String[] args) {
        System.out.println("--- Sistem Restaurant: Abstract Factory ---");


        System.out.println("Client 1 (Standard):");
        FactoryMeniuRestaurant fabricaStandard = new FactoryMeniuStandard();
        servireClient(fabricaStandard);


        System.out.println("Client 2 (Vegan):");
        FactoryMeniuRestaurant fabricaVegan = new FactoryMeniuVegan();
        servireClient(fabricaVegan);
    }
}