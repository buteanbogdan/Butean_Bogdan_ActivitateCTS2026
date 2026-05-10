public class StareLivrata implements StareComanda {
    @Override
    public void schimbaStare(Comanda comanda) {
        System.out.println("-> [SISTEM] Comanda " + comanda.getIdComanda() + " a fost PRE डाटा curierului si livrata clientului final.");
        comanda.setStare(this);
    }

    @Override
    public String toString() {
        return "Stadiu: LIVRATA";
    }
}