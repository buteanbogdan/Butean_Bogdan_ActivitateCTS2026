public abstract class OperatorSuport {

    protected OperatorSuport succesor;

    public void setSuccesor(OperatorSuport succesor) {
        this.succesor = succesor;
    }

    public abstract void rezolvaTicket(TicketSuport ticket);
}