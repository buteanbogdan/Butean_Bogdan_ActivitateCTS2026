public class AdapterLivrareClase extends CompanieLogisticaExterna implements LivrareMagazin {
    private String adresaDovada;

    public AdapterLivrareClase(String adresa) {
        this.adresaDovada = adresa;
    }

    @Override
    public void livreazaProdus(String denumireProdus) {
        // Ne folosim de metoda expediazaColet pe care am moștenit-o direct din super-clasă
        super.expediazaColet(denumireProdus, this.adresaDovada);
    }
}