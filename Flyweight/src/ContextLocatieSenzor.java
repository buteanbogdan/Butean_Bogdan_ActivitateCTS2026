public class ContextLocatieSenzor {
    private String strada;
    private double coordonataGPS_X;
    private double coordonataGPS_Y;

    public ContextLocatieSenzor(String strada, double coordonataGPS_X, double coordonataGPS_Y) {
        this.strada = strada;
        this.coordonataGPS_X = coordonataGPS_X;
        this.coordonataGPS_Y = coordonataGPS_Y;
    }

    public String getStrada() {
        return strada;
    }

    public double getCoordonataGPS_X() {
        return coordonataGPS_X;
    }

    public double getCoordonataGPS_Y() {
        return coordonataGPS_Y;
    }
}