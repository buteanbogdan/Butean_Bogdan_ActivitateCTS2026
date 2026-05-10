public class Comanda {
    private int idComanda;

    private StareComanda stareCurenta;

    public Comanda(int idComanda) {
        this.idComanda = idComanda;
        this.stareCurenta = null;
    }

    public int getIdComanda() {
        return idComanda;
    }


    public void setStare(StareComanda stare) {
        this.stareCurenta = stare;
    }

    public StareComanda getStare() {
        return stareCurenta;
    }
}