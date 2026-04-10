public class DecoratorAntrenorPersonal extends DecoratorAbonament {

    public DecoratorAntrenorPersonal(AbonamentFitness abonamentDecorat) {
        super(abonamentDecorat);
    }

    @Override
    public void afisareDetalii() {

        super.afisareDetalii();

        System.out.println(" + [EXTRA] Sesiuni saptamanale cu Antrenor Personal incluse.");
    }
}