public class FactoryNotificareEmail implements FactoryNotificare {
    @Override
    public Notificare creareNotificare() {
        return new NotificareEmail();
    }
}