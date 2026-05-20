package OBSERVER.OBSERVER_STB.main;

import OBSERVER.OBSERVER_STB.clase.Calator;
import OBSERVER.OBSERVER_STB.clase.CalatorAbonat;
import OBSERVER.OBSERVER_STB.clase.DispeceratSTB;
import OBSERVER.OBSERVER_STB.clase.ICompanieSTB;

public class Main {
    public static void main(String[] args) {
        Calator calator1 = new CalatorAbonat("Ionut", "L336");
        Calator calator2 = new CalatorAbonat("Maria", "L41");

        ICompanieSTB dispecerat = new DispeceratSTB("Centru");
        dispecerat.aboneazaCalator(calator1);
        dispecerat.aboneazaCalator(calator2);

        ((DispeceratSTB) dispecerat).notificaIntarziere();
        ((DispeceratSTB) dispecerat).notificaDeviere();
    }
}