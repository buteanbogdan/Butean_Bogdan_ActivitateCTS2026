public class FactoryNotificareSMS implements FactoryNotificare {
    @Override
    public Notificare creareNotificare() {
        return new NotificareSMS();
    }
}