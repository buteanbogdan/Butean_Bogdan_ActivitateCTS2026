public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Magazin Online (Strategy Pattern) ---\n");


        CosCumparaturi cosClient = new CosCumparaturi(1000.0);


        cosClient.plateste();


        cosClient.setStrategieReducere(new ReducereFidelitate());
        cosClient.plateste();

        cosClient.setStrategieReducere(new ReducereBlackFriday());
        cosClient.plateste();
    }
}