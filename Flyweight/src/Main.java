public class Main {
    public static void main(String[] args) {

        System.out.println("--- Smart City Platform (Flyweight Pattern) ---\n");

        FabricaSenzori fabricaDeSenzori = new FabricaSenzori();


        ISenzorOras senzorTemp1 = fabricaDeSenzori.getSenzor("Temperatura");
        ContextLocatieSenzor centru = new ContextLocatieSenzor("Piața Universitatii", 44.435, 26.102);
        senzorTemp1.inregistreazaValoare(centru, 24.5);
        System.out.println("--------------------------------------------------");


        ISenzorOras senzorPoluare1 = fabricaDeSenzori.getSenzor("Poluare");
        senzorPoluare1.inregistreazaValoare(centru, 55.0);
        System.out.println("--------------------------------------------------");


        ISenzorOras senzorTemp2 = fabricaDeSenzori.getSenzor("Temperatura");
        ContextLocatieSenzor obor = new ContextLocatieSenzor("Piața Obor", 44.449, 26.124);
        senzorTemp2.inregistreazaValoare(obor, 23.0);

        ISenzorOras senzorTemp3 = fabricaDeSenzori.getSenzor("Temperatura");
        ContextLocatieSenzor drumulTaberei = new ContextLocatieSenzor("Parc Drumul Taberei", 44.421, 26.033);
        senzorTemp3.inregistreazaValoare(drumulTaberei, 22.5);
        System.out.println("--------------------------------------------------");


        ISenzorOras senzorPoluare2 = fabricaDeSenzori.getSenzor("Poluare");
        senzorPoluare2.inregistreazaValoare(drumulTaberei, 40.2);
    }
}