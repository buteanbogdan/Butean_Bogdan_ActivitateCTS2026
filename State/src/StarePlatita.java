public class StarePlatita implements StareComanda {
    @Override
    public void schimbaStare(Comanda comanda) {
        System.out.println("-> [SISTEM] Plata pentru comanda " + comanda.getIdComanda() + " a fost confirmata. Se pregateste coletul.");
        comanda.setStare(this);
    }

    @Override
    public String toString() {
        return "Stadiu: PLATITA";
    }
}