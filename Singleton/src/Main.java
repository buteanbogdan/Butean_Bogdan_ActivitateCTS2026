public class Main {
    public static void main(String[] args) {
        ManagementClinica s1 = ManagementClinica.getInstanta();
        ManagementClinica s2 = ManagementClinica.getInstanta();

        System.out.println(s1 == s2); // Va afișa true (este exact aceeași zona de memorie)

        s1.setNumarDoctori(20);
        System.out.println(s2.getNumarDoctori()); // Va afisa 20, pentru ca s2 este s1
    }
}