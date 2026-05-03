public class JuniorIT extends OperatorSuport {
    @Override
    public void rezolvaTicket(TicketSuport ticket) {
        if (ticket.getNivelGravitate() == 1) {
            System.out.println("[JUNIOR IT] Am rezolvat eu problema: '" + ticket.getProblema() + "'. A fost usor.");
        } else {

            if (super.succesor != null) {
                System.out.println("   [Junior IT] Problema ma depaseste. Transfer ticketul catre Senior...");
                super.succesor.rezolvaTicket(ticket);
            }
        }
    }
}