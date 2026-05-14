public class DocumentWord {
    private String titlu;
    private String textCurent;

    public DocumentWord(String titlu, String textInitial) {
        this.titlu = titlu;
        this.textCurent = textInitial;
    }

    public void adaugaText(String textNou) {
        this.textCurent += "\n" + textNou;
    }

    public MementoDocument creeazaSalvare() {
        System.out.println(" S-a salvat starea documentului.");
        return new MementoDocument(this.textCurent);
    }

    public void restaureazaSalvare(MementoDocument memento) {
        this.textCurent = memento.getContinutSalvat();
        System.out.println(" Documentul a fost restaurat la o versiune anterioara.");
    }

    public void afiseazaDocument() {
        System.out.println("=== Document: " + titlu + " ===");
        System.out.println(textCurent);
        System.out.println("=================================\n");
    }
}