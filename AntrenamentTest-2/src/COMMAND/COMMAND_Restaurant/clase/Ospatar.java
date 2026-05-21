package COMMAND.COMMAND_Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
    private List<ComandaRestaurant> comenzi = new ArrayList<>();

    public void adaugaComanda(ComandaRestaurant comanda) {
        comenzi.add(comanda);
    }

    public void executaComanda() {
        if(comenzi.size() > 0) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}