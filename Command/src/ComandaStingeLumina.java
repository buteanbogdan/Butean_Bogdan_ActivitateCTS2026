public class ComandaStingeLumina implements ComandaSmart {
    private SistemIluminat sistemIluminat;

    public ComandaStingeLumina(SistemIluminat sistemIluminat) {
        this.sistemIluminat = sistemIluminat;
    }

    @Override
    public void executa() {
        sistemIluminat.stingeLumina();
    }
}