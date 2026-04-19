import java.util.HashMap;
import java.util.Map;

public class FabricaSenzori {


    private Map<String, ISenzorOras> cacheSenzori;

    public FabricaSenzori() {
        this.cacheSenzori = new HashMap<>();
    }

    public ISenzorOras getSenzor(String tipCumparat) {

        if (cacheSenzori.containsKey(tipCumparat)) {
            System.out.println(" [REUSE] Se refoloseste instanta din memorie pentru senzorul de " + tipCumparat);
            return cacheSenzori.get(tipCumparat);
        } else {

            ISenzorOras senzorNou;

            if (tipCumparat.equalsIgnoreCase("Temperatura")) {
                senzorNou = new ModelSenzorHardware("Temperatura", "Bosch IoT", "°C");
            } else if (tipCumparat.equalsIgnoreCase("Poluare")) {
                senzorNou = new ModelSenzorHardware("Poluare Aer", "Siemens Smart", "PM2.5");
            } else {
                senzorNou = new ModelSenzorHardware(tipCumparat, "Generic Brand", "unitati");
            }

            cacheSenzori.put(tipCumparat, senzorNou);
            return senzorNou;
        }
    }
}