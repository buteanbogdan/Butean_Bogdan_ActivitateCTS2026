public class Main {


    public static void proceseazaNotificare(FactoryNotificare fabrica, String mesaj) {
        Notificare notificare = fabrica.creareNotificare();
        notificare.trimiteMesaj(mesaj);
    }

    public static void main(String[] args) {
        System.out.println("--- Sistem Notificari: Factory Method ---");


        FactoryNotificare fabricaEmail = new FactoryNotificareEmail();
        FactoryNotificare fabricaSMS = new FactoryNotificareSMS();
        FactoryNotificare fabricaPush = new FactoryNotificarePush();

        // Generăm obiectele și le folosim, delegând crearea către fabricile specifice
        proceseazaNotificare(fabricaEmail, "Factura ta a fost emisa.");
        proceseazaNotificare(fabricaSMS, "Codul tau de securitate este 1234.");
        proceseazaNotificare(fabricaPush, "Ai un nou mesaj in aplicatie!");
    }
}