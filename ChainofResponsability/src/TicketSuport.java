public class TicketSuport {
    private String problema;
    private int nivelGravitate;

    public TicketSuport(String problema, int nivelGravitate) {
        this.problema = problema;
        this.nivelGravitate = nivelGravitate;
    }

    public String getProblema() {
        return problema;
    }

    public int getNivelGravitate() {
        return nivelGravitate;
    }
}