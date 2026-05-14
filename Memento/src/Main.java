public class Main {
    public static void main(String[] args) {
        System.out.println("--- Editor Text (Memento Pattern) ---\n");

        ManagerIstoric istoric = new ManagerIstoric();

        DocumentWord contract = new DocumentWord("Contract_Inchiriere.docx", "Art 1. Partile contractante...");

        contract.adaugaText("Art 2. Chiria lunara este de 500 Euro.");
        contract.afiseazaDocument();

        istoric.adaugaMemento(contract.creeazaSalvare());

        contract.adaugaText("Art 3. Garantia este echivalentul a doua luni de chirie.");
        contract.afiseazaDocument();


        istoric.adaugaMemento(contract.creeazaSalvare());

        System.out.println("-> Utilizatorul scrie din greseala un text corupt:");
        contract.adaugaText("ASDASDASD GRESALA FATALA 12345");
        contract.afiseazaDocument();


        System.out.println("-> Utilizatorul apasa Ctrl+Z pentru a reveni la ultima salvare buna...");
        MementoDocument salvareBuna = istoric.getMemento(1);

        if (salvareBuna != null) {
            contract.restaureazaSalvare(salvareBuna);
        }

        contract.afiseazaDocument();
    }
}