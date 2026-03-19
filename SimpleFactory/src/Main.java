public class Main {
    public static void main(String[] args) {

        System.out.println("--- Sistem Spital: Simple Factory ---");


        FactoryPersonal factory = new FactoryPersonal();

        try {

            PersonalSpital angajat1 = factory.crearePersonal(TipPersonal.MEDIC, "Popescu Andrei");
            PersonalSpital angajat2 = factory.crearePersonal(TipPersonal.ASISTENT, "Ionescu Maria");
            PersonalSpital angajat3 = factory.crearePersonal(TipPersonal.BRANCARDIER, "Vasile Gheorghe");


            angajat1.afisareDetalii();
            angajat2.afisareDetalii();
            angajat3.afisareDetalii();

        } catch (Exception e) {
            System.out.println("Eroare la crearea personalului: " + e.getMessage());
        }
    }
}