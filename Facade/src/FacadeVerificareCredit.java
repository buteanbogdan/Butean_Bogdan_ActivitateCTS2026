public class FacadeVerificareCredit {


    public static boolean verificaEligibilitateCredit(ClientBanca client) {

        System.out.println("--- START VERIFICARI AUTOMATE ---");


        if (!EvidentaPopulatiei.nuEsteUrmaritGeneral(client)) {
            System.out.println("Respins: Probleme la Evidenta Populatiei.");
            return false;
        }

        if (!BirouCredite.areIstoricCurat(client)) {
            System.out.println("Respins: Istoric negativ la Biroul de Credite.");
            return false;
        }

        if (!BNR.esteEligibilPentruNouCredit(client)) {
            System.out.println("Respins: Nu indeplineste conditiile BNR.");
            return false;
        }

        System.out.println("--- VERIFICARI FINALIZATE CU SUCCES ---");
        return true;
    }
}