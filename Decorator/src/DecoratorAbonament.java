public abstract class DecoratorAbonament implements AbonamentFitness {


    protected AbonamentFitness abonamentDecorat;


    public DecoratorAbonament(AbonamentFitness abonamentDecorat) {
        this.abonamentDecorat = abonamentDecorat;
    }

    @Override
    public void afisareDetalii() {

        this.abonamentDecorat.afisareDetalii();
    }
}