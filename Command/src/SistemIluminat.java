public class SistemIluminat {
    private String camera;

    public SistemIluminat(String camera) {
        this.camera = camera;
    }


    public void aprindeLumina() {
        System.out.println("Lumina a fost APRINSA in: " + camera);
    }


    public void stingeLumina() {
        System.out.println("Lumina a fost STINSA in: " + camera);
    }
}