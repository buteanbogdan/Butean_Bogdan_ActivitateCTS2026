public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Bancar (Proxy Pattern) ---");

        CardBancar cardMaria = new CardBancar("Maria Ionescu", "1234", 5000);


        InterfataBancomat bancomatMecanic = new BancomatReal();


        InterfataBancomat bancomatSecurizat = new ProxyBancomatSecurizat(bancomatMecanic);


        bancomatSecurizat.retrageNumerar(cardMaria, "0000", 1000);


        bancomatSecurizat.retrageNumerar(cardMaria, "1234", 9000);


        bancomatSecurizat.retrageNumerar(cardMaria, "1234", 1500);

        System.out.println("\n--------------------------------------------------");

    }
}