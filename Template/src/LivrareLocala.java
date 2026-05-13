public class LivrareLocala extends ProcesLivrare {
    private String adresa;

    public LivrareLocala(String adresa) {
        this.adresa = adresa;
    }

    @Override
    protected void preluareColet() {
        System.out.println(" Preluare colet din depozitul orasului.");
    }

    @Override
    protected void transportColet() {
        System.out.println(" Curierul se deplaseaza cu bicicleta electrica catre adresa.");
    }

    @Override
    protected void predareColet() {
        System.out.println(" Coletul a fost inmanat personal la adresa: " + adresa);
    }
}