public class LivrareInternationala extends ProcesLivrare {
    private String taraDestinatie;

    public LivrareInternationala(String taraDestinatie) {
        this.taraDestinatie = taraDestinatie;
    }

    @Override
    protected void preluareColet() {
        System.out.println("[INTERNATIONAL] Preluare colet si verificare la centrul vamal principal.");
    }

    @Override
    protected void transportColet() {
        System.out.println("[INTERNATIONAL] Coletul este incarcat in avionul cargo cu destinatia " + taraDestinatie + ".");
    }

    @Override
    protected void predareColet() {
        System.out.println("[INTERNATIONAL] Coletul a fost predat partenerului de curierat din " + taraDestinatie + ".");
    }
}