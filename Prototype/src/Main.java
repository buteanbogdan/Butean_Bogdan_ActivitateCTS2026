public class Main {
    public static void main(String[] args) {

        System.out.println("--- Sistem Bancar: Prototype Pattern ---");


        ContractCredit prototipIpotecar = new ContractCredit("Ipotecar Standard");
        System.out.println("Prototip creat: " + prototipIpotecar);
        System.out.println("--------------------------------------------------");


        System.out.println("⚡ Generare contract pentru Clientul 1...");
        ContractCredit contractClient1 = (ContractCredit) prototipIpotecar.cloneaza();


        contractClient1.adaugaClauza("4. Clauza speciala: Asigurare de viata inclusa.");


        System.out.println("⚡ Generare contract pentru Clientul 2...");
        ContractCredit contractClient2 = (ContractCredit) prototipIpotecar.cloneaza();


        System.out.println("\n--- SITUATIA FINALA ---");
        System.out.println("Prototipul original: " + prototipIpotecar.getClauzeContractuale());
        System.out.println("Contract Client 1  : " + contractClient1.getClauzeContractuale());
        System.out.println("Contract Client 2  : " + contractClient2.getClauzeContractuale());
    }
}