
public class RezervareRestaurantBuilder implements BuilderRezervare {

    private RezervareRestaurant rezervare;

    public RezervareRestaurantBuilder() {
        rezervare = new RezervareRestaurant(false, false, false, false, false);
    }

    @Override
    public RezervareRestaurant build() {
        return rezervare;
    }

    public RezervareRestaurantBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public RezervareRestaurantBuilder setScaunCopil(boolean scaunCopil) {
        this.rezervare.setScaunCopil(scaunCopil);
        return this;
    }

    public RezervareRestaurantBuilder setDecoratieRomantica(boolean decoratieRomantica) {
        this.rezervare.setDecoratieRomantica(decoratieRomantica);
        return this;
    }

    public RezervareRestaurantBuilder setMuzicaLive(boolean muzicaLive) {
        this.rezervare.setMuzicaLive(muzicaLive);
        return this;
    }

    public RezervareRestaurantBuilder setMeniuVegan(boolean meniuVegan) {
        this.rezervare.setMeniuVegan(meniuVegan);
        return this;
    }
}