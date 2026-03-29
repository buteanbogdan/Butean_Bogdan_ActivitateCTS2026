public class AdapterLivrareObiecte implements LivrareMagazin {

    private CompanieLogisticaExterna logisticaExterna;
    private String adresaDovada;

    public AdapterLivrareObiecte(CompanieLogisticaExterna logisticaExterna, String adresa) {
        this.logisticaExterna = logisticaExterna;
        this.adresaDovada = adresa;
    }

    @Override
    public void livreazaProdus(String denumireProdus) {

        this.logisticaExterna.expediazaColet(denumireProdus, this.adresaDovada);
    }
}