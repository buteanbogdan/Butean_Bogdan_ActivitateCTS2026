public class FactoryMeniuStandard implements FactoryMeniuRestaurant {
    @Override
    public Supa creareSupa() {
        return new SupaDePui();
    }

    @Override
    public FelPrincipal creareFelPrincipal() {
        return new FripturaDeVita();
    }
}