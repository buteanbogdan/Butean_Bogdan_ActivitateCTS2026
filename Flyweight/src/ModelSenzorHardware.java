public class ModelSenzorHardware implements ISenzorOras {


    private String tipSenzor;
    private String producator;
    private String unitateMasura;

    public ModelSenzorHardware(String tipSenzor, String producator, String unitateMasura) {
        this.tipSenzor = tipSenzor;
        this.producator = producator;
        this.unitateMasura = unitateMasura;

        System.out.println(" [SISTEM] S-a incarcat in memorie driver-ul hardware pentru: " + tipSenzor + " (" + producator + ")");
    }

    @Override
    public void inregistreazaValoare(ContextLocatieSenzor context, double valoareCitita) {

        System.out.println(" Date primite de la [" + tipSenzor + "]: "
                + valoareCitita + " " + unitateMasura
                + " | Locatie: " + context.getStrada()
                + " (GPS: " + context.getCoordonataGPS_X() + ", " + context.getCoordonataGPS_Y() + ")");
    }
}