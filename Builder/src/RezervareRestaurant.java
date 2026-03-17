
public class RezervareRestaurant {
    private boolean asezareLaGeam;
    private boolean scaunCopil;
    private boolean decoratieRomantica;
    private boolean muzicaLive;
    private boolean meniuVegan;

    public RezervareRestaurant(boolean asezareLaGeam, boolean scaunCopil, boolean decoratieRomantica, boolean muzicaLive, boolean meniuVegan) {
        super();
        this.asezareLaGeam = asezareLaGeam;
        this.scaunCopil = scaunCopil;
        this.decoratieRomantica = decoratieRomantica;
        this.muzicaLive = muzicaLive;
        this.meniuVegan = meniuVegan;
    }

    public boolean isAsezareLaGeam() {
        return asezareLaGeam;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public boolean isScaunCopil() {
        return scaunCopil;
    }

    public void setScaunCopil(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
    }

    public boolean isDecoratieRomantica() {
        return decoratieRomantica;
    }

    public void setDecoratieRomantica(boolean decoratieRomantica) {
        this.decoratieRomantica = decoratieRomantica;
    }

    public boolean isMuzicaLive() {
        return muzicaLive;
    }

    public void setMuzicaLive(boolean muzicaLive) {
        this.muzicaLive = muzicaLive;
    }

    public boolean isMeniuVegan() {
        return meniuVegan;
    }

    public void setMeniuVegan(boolean meniuVegan) {
        this.meniuVegan = meniuVegan;
    }

    @Override
    public String toString() {
        return "RezervareRestaurant [asezareLaGeam=" + asezareLaGeam + ", scaunCopil=" + scaunCopil
                + ", decoratieRomantica=" + decoratieRomantica + ", muzicaLive=" + muzicaLive
                + ", meniuVegan=" + meniuVegan + "]";
    }
}