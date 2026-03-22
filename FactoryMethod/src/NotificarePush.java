public class NotificarePush implements Notificare {
    @Override
    public void trimiteMesaj(String mesaj) {
        System.out.println("Se trimite PUSH NOTIFICATION pe telefon cu mesajul: " + mesaj);
    }
}