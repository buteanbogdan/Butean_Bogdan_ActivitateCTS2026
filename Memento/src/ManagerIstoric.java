import java.util.ArrayList;
import java.util.List;

public class ManagerIstoric {

    private List<MementoDocument> listaSalvari;

    public ManagerIstoric() {
        this.listaSalvari = new ArrayList<>();
    }

    public void adaugaMemento(MementoDocument memento) {
        listaSalvari.add(memento);
    }

    public MementoDocument getMemento(int index) {
        if (index >= 0 && index < listaSalvari.size()) {
            return listaSalvari.get(index);
        }
        return null;
    }
}