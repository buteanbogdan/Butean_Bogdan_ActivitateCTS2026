public class FactoryMeniuVegan implements FactoryMeniuRestaurant {
    @Override
    public Supa creareSupa() {
        return new SupaCupaRosii();
    }

    @Override
    public FelPrincipal creareFelPrincipal() {
        return new SnitelDinSoia();
    }
}