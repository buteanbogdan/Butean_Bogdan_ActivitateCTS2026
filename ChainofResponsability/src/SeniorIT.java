public class SeniorIT extends OperatorSuport {
    @Override
    public void rezolvaTicket(TicketSuport ticket) {
        if (ticket.getNivelGravitate() == 2) {
            System.out.println(" [SENIOR IT] Am preluat si rezolvat problema: '" + ticket.getProblema() + "'. Necesita atentie.");
        } else {
            if (super.succesor != null) {
                System.out.println("   [Senior IT] Este o problema de infrastructura critica. Transfer la Manager...");
                super.succesor.rezolvaTicket(ticket);
            }
        }
    }
}