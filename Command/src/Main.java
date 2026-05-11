public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistem Smart Home (Command Pattern) ---\n");


        SistemIluminat becSufragerie = new SistemIluminat("Sufragerie");
        SistemIluminat becDormitor = new SistemIluminat("Dormitor");


        ComandaSmart cmdAprindeSufragerie = new ComandaAprindeLumina(becSufragerie);
        ComandaSmart cmdStingeSufragerie = new ComandaStingeLumina(becSufragerie);
        ComandaSmart cmdAprindeDormitor = new ComandaAprindeLumina(becDormitor);


        TelecomandaHub telecomanda = new TelecomandaHub();


        telecomanda.preiaComanda(cmdAprindeSufragerie);
        telecomanda.preiaComanda(cmdAprindeDormitor);
        telecomanda.preiaComanda(cmdStingeSufragerie);


        telecomanda.executaToateComenzile();
    }
}