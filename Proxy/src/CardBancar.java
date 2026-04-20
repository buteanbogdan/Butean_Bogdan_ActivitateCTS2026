public class CardBancar {
    private String titular;
    private String pinCorect;
    private double sold;

    public CardBancar(String titular, String pinCorect, double sold) {
        this.titular = titular;
        this.pinCorect = pinCorect;
        this.sold = sold;
    }

    public String getTitular() {
        return titular;
    }

    public String getPinCorect() {
        return pinCorect;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}