package FLYWEIGHT.FLYWEIGHT_A10Spital.main;

import FLYWEIGHT.FLYWEIGHT_A10Spital.clase.Internare;
import FLYWEIGHT.FLYWEIGHT_A10Spital.clase.PacientFactory;

public class Main {
    public static void main(String[] args){
        Internare internare1 = new Internare(20, 5, 10);
        Internare internare2 = new Internare(20, 4,15);

        PacientFactory pacientFactory = new PacientFactory();
        pacientFactory.getPacienti("Mihai", "1232312321", "Weiner").afiseazaDetaliiInternare(internare1);
        pacientFactory.getPacienti("Andrei", "1232312321231", "Moldova").afiseazaDetaliiInternare(internare1);
        pacientFactory.getPacienti("Mihai", "1232312321", "Weiner").afiseazaDetaliiInternare(internare2);
    }
}
