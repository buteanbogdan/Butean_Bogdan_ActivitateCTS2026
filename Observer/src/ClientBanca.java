public class ClientBanca implements Abonat {
    private String numeClient;

    public ClientBanca(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("-> [" + numeClient + "] ai primit un SMS: " + mesaj);
    }
}