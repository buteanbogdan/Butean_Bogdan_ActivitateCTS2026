public class StarePlasata implements StareComanda {
    @Override
    public void schimbaStare(Comanda comanda) {
        System.out.println("-> [SISTEM] Comanda cu ID-ul " + comanda.getIdComanda() + " a fost INREGISTRATA in sistem si asteapta plata.");

        comanda.setStare(this);
    }

    @Override
    public String toString() {
        return "Stadiu: PLASATA";
    }
}