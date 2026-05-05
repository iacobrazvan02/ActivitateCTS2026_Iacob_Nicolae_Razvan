package ro.ase.cts.main;

import ro.ase.cts.clase.ISpital;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientAbonat;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Ionescu", 30);
        Pacient pacient2 = new PacientAbonat("Popescu", 40);
        Pacient pacient3 = new PacientAbonat("Dinescu", 50);

        ISpital spital = new Spital("Cantacuzino");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notificaVirus();
        System.out.println("------------------------");
        ((Spital) spital).notificaEpidemie();

    }
}