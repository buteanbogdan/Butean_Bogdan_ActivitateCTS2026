public class ManagerIT extends OperatorSuport {
    @Override
    public void rezolvaTicket(TicketSuport ticket) {
        if (ticket.getNivelGravitate() >= 3) {
            System.out.println(" [MANAGER IT] Am intervenit de urgenta pentru problema: '" + ticket.getProblema() + "'. Sistemul este salvat.");
        } else {
            System.out.println("   [Manager IT] Eroare: Nu exista persoana capabila sa rezolve acest ticket.");
        }
    }
}