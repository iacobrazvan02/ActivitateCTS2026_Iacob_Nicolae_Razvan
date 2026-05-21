package COMMAND.COMMAND_Spital.main;

import COMMAND.COMMAND_Spital.clase.ComandaSpital;
import COMMAND.COMMAND_Spital.clase.ComandaTratament;
import COMMAND.COMMAND_Spital.clase.Medic;
import COMMAND.COMMAND_Spital.clase.OperatorInternari;

public class Main {
    public static void main(String[] args) {
        OperatorInternari operator = new OperatorInternari();
        ComandaSpital comanda1 = new ComandaTratament(new Medic("Iacob"), "Andrei");
        ComandaSpital comanda2 = new ComandaTratament(new Medic("Ilie"), "Mihai");

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new ComandaTratament(new Medic("Vasile"), "Alex"));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
