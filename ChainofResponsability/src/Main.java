public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Helpdesk (Chain of Responsibility) ---\n");

        // 1. Instantiem verigile
        OperatorSuport junior = new JuniorIT();
        OperatorSuport senior = new SeniorIT();
        OperatorSuport manager = new ManagerIT();

        // 2. CONSTRUIM LANTUL
        // Juniorul da la Senior, Seniorul da la Manager
        junior.setSuccesor(senior);
        senior.setSuccesor(manager);

        // 3. Generam cererile (Ticketele)
        TicketSuport ticket1 = new TicketSuport("Am uitat parola la email", 1);
        TicketSuport ticket2 = new TicketSuport("Nu se conecteaza laptopul la VPN", 2);
        TicketSuport ticket3 = new TicketSuport("A picat serverul principal de baza de date!", 3);

        // 4. Testam sistemul
        // Clientul (sau programul principal) trimite mereu problema la cel mai de jos nivel
        System.out.println("Trimitem Ticketul 1:");
        junior.rezolvaTicket(ticket1);

        System.out.println("\nTrimitem Ticketul 2:");
        junior.rezolvaTicket(ticket2);

        System.out.println("\nTrimitem Ticketul 3:");
        junior.rezolvaTicket(ticket3);
    }
}