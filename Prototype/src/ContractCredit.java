import java.util.ArrayList;
import java.util.List;

public class ContractCredit implements PrototipContract {
    private String tipCredit;
    private List<String> clauzeContractuale;


    public ContractCredit(String tipCredit) {
        System.out.println("🔄 Se descarcă clauzele din baza de date pentru creditul: " + tipCredit + " (dureaza mult)...");
        this.tipCredit = tipCredit;
        this.clauzeContractuale = new ArrayList<>();

        // Simulam incarcarea a zeci de pagini de clauze
        this.clauzeContractuale.add("1. Dobanda variabila de 5%");
        this.clauzeContractuale.add("2. Comision de administrare lunar");
        this.clauzeContractuale.add("3. Penalitati de intarziere");
    }


    private ContractCredit(String tipCredit, List<String> clauze) {
        this.tipCredit = tipCredit;
        // DEEP COPY: Creăm o listă NOUĂ, nu copiem doar referința!
        this.clauzeContractuale = new ArrayList<>(clauze);
    }

    @Override
    public PrototipContract cloneaza() {

        return new ContractCredit(this.tipCredit, this.clauzeContractuale);
    }


    public String getTipCredit() {
        return tipCredit;
    }

    public void setTipCredit(String tipCredit) {
        this.tipCredit = tipCredit;
    }

    public List<String> getClauzeContractuale() {
        return clauzeContractuale;
    }


    public void adaugaClauza(String clauzaNoua) {
        this.clauzeContractuale.add(clauzaNoua);
    }

    @Override
    public String toString() {
        return "ContractCredit [tipCredit=" + tipCredit + ", clauze=" + clauzeContractuale.size() + " clauze incarcate]";
    }
}