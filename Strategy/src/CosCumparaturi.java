public class CosCumparaturi {
    private double totalCos;


    private StrategieReducere strategieCurenta;

    public CosCumparaturi(double totalCos) {
        this.totalCos = totalCos;

        this.strategieCurenta = new FaraReducere();
    }

    public void setStrategieReducere(StrategieReducere strategieReducere) {
        this.strategieCurenta = strategieReducere;
    }

    public void plateste() {
        if (strategieCurenta != null) {
            double sumaFinala = strategieCurenta.calculeazaPretFinal(totalCos);
            System.out.println("Suma totala de plata este: " + sumaFinala + " RON.\n");
        }
    }
}