public class ProxyBancomatSecurizat implements InterfataBancomat {


    private InterfataBancomat bancomatReal;

    public ProxyBancomatSecurizat(InterfataBancomat bancomatReal) {
        this.bancomatReal = bancomatReal;
    }

    @Override
    public void retrageNumerar(CardBancar card, String pinIntrodus, double sumaCeruta) {

        System.out.println("\n [PROXY] Se verifica tranzactia pentru: " + card.getTitular() + "...");

        // 1. Verificam SECURITATEA (daca PIN-ul e corect)
        if (!card.getPinCorect().equals(pinIntrodus)) {
            System.out.println(" [EROARE SECURITATE] PIN incorect! Tranzactia a fost blocata.");
            return; // Oprim tot, apelul nu mai ajunge la bancomatul real
        }

        // 2. Verificam FONDURILE (optional, tot o forma de protectie)
        if (card.getSold() < sumaCeruta) {
            System.out.println(" [EROARE FONDURI] Sold insuficient pentru a retrage " + sumaCeruta + " RON.");
            return;
        }

        // Daca am trecut de toate filtrele Proxy-ului, delegam sarcina catre obiectul real
        System.out.println(" [PROXY] Validare reusita. Se trimite comanda catre bancomat...");
        bancomatReal.retrageNumerar(card, pinIntrodus, sumaCeruta);
    }
}