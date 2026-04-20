public class BancomatReal implements InterfataBancomat {

    @Override
    public void retrageNumerar(CardBancar card, String pinIntrodus, double sumaCeruta) {

        System.out.println("[SUCCES] Se elibereaza suma de " + sumaCeruta + " RON.");
        card.setSold(card.getSold() - sumaCeruta);
        System.out.println("   Sold ramas pentru " + card.getTitular() + ": " + card.getSold() + " RON.");
    }
}