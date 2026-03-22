public class NotificareEmail implements Notificare {
    @Override
    public void trimiteMesaj(String mesaj) {
        System.out.println("Se trimite EMAIL cu mesajul: " + mesaj);
    }
}