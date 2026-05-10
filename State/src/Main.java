public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Gestiune Comenzi (State Pattern) ---\n");

        Comanda comandaLaptop = new Comanda(1005);


        StareComanda stadiuStart = new StarePlasata();
        StareComanda stadiuMijloc = new StarePlatita();
        StareComanda stadiuFinal = new StareLivrata();


        stadiuStart.schimbaStare(comandaLaptop);
        System.out.println("Verificare status curent: " + comandaLaptop.getStare().toString() + "\n");

        stadiuMijloc.schimbaStare(comandaLaptop);
        System.out.println("Verificare status curent: " + comandaLaptop.getStare().toString() + "\n");

        stadiuFinal.schimbaStare(comandaLaptop);
        System.out.println("Verificare status curent: " + comandaLaptop.getStare().toString() + "\n");
    }
}