public class FactoryNotificarePush implements FactoryNotificare {
    @Override
    public Notificare creareNotificare() {
        return new NotificarePush();
    }
}