public class LivrareCurierPropriu implements LivrareMagazin {
    @Override
    public void livreazaProdus(String denumireProdus) {
        System.out.println("Curierul magazinului a livrat produsul: " + denumireProdus);
    }
}