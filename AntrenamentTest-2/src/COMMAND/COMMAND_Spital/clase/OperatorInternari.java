package COMMAND.COMMAND_Spital.clase;

import java.util.List;

public class OperatorInternari {
    private List<ComandaSpital> comenzi = new java.util.ArrayList<>();

    public void adaugaComanda(ComandaSpital comanda) {
        comenzi.add(comanda);
    }

    public void executaComanda() {
        if(comenzi.size() > 0) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}