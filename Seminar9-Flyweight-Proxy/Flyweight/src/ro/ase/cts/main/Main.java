package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("BMW", 2004, 30);
        Autobuz autobuz2 = new Autobuz("MERCEDES", 2012, 50);
        Autobuz autobuz3 = new Autobuz("HONDA", 2016, 20);

        LinieFactory linieFactory = new LinieFactory();
        linieFactory.getLinie(102, "CFR", "Pantelimon").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(103, "Romana", "Universitate").afiseazaNrMaximDeCalatoriTraseu(autobuz3);
        linieFactory.getLinie(102,"a","b").afiseazaAutobuzLinie(autobuz1);


    }
}