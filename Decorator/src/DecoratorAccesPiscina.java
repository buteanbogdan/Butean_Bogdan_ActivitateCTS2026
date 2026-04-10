public class DecoratorAccesPiscina extends DecoratorAbonament {

    public DecoratorAccesPiscina(AbonamentFitness abonamentDecorat) {
        super(abonamentDecorat);
    }

    @Override
    public void afisareDetalii() {
        super.afisareDetalii();
        System.out.println(" + [EXTRA] Acces nelimitat la piscina, sauna si jacuzzi.");
    }
}