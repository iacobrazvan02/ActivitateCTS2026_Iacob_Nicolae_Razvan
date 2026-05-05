package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi = new ArrayList<>();

    public void inregistreazaComenzi(Command comanda) {
        listaComenzi.add(comanda);
    }

    public void executaComenzi() {
        if(listaComenzi.size() > 0) {
            listaComenzi.get(0).execute();
            listaComenzi.remove(0);
        }
    }
}
