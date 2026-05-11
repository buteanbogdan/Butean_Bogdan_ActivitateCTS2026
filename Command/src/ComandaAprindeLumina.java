public class ComandaAprindeLumina implements ComandaSmart {


    private SistemIluminat sistemIluminat;

    public ComandaAprindeLumina(SistemIluminat sistemIluminat) {
        this.sistemIluminat = sistemIluminat;
    }

    @Override
    public void executa() {

        sistemIluminat.aprindeLumina();
    }
}