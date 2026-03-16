public class ManagementClinica {
    private String numeClinica;
    private String adresa;
    private int numarDoctori;

    // Instanta este creata imediat (Eager)
    private static final ManagementClinica instanta = new ManagementClinica();

    // Constructor privat
    private ManagementClinica() {
        this.numeClinica = "MedLife Premium";
        this.adresa = "Strada Victoriei, Nr. 10";
        this.numarDoctori = 12;
    }

    // Metoda publica prin care oferim acces la instanta unica
    public static ManagementClinica getInstanta() {
        return instanta;
    }

    // Getters si Setters
    public String getNumeClinica() {
        return numeClinica;
    }

    public void setNumeClinica(String numeClinica) {
        this.numeClinica = numeClinica;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNumarDoctori() {
        return numarDoctori;
    }

    public void setNumarDoctori(int numarDoctori) {
        this.numarDoctori = numarDoctori;
    }

    @Override
    public String toString() {
        return "Clinica: " + numeClinica + ", Adresa: " + adresa + ", Doctori: " + numarDoctori;
    }
}