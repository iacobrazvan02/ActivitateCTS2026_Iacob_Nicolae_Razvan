package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic  = new Medic("Matei");
        PersonalSpital asistenta = new Asistenta("Andreea");

        Pacient pacient1 = new Pacient("Andrei");
        Pacient pacient2 = new Pacient("Dragos");

        Command comanda1 = new Internare(medic, pacient1);
        Command comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();
        operator.inregistreazaComenzi(comanda1);
        operator.inregistreazaComenzi(comanda2);

        operator.executaComenzi();
        operator.inregistreazaComenzi(new Tratare(asistenta, new Pacient("Gigel")));
        operator.executaComenzi();
        operator.executaComenzi();
    }
}