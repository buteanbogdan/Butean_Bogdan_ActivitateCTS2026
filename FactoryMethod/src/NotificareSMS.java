public class NotificareSMS implements Notificare {
    @Override
    public void trimiteMesaj(String mesaj) {
        System.out.println("Se trimite SMS cu mesajul: " + mesaj);
    }
}