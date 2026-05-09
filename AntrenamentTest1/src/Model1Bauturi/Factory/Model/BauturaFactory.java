package Model1Bauturi.Factory.Model;

import ModelBauturi3.Factory.BauturaType;

public class BauturaFactory {
    public Bautura creareBautura(BauturaType tip, String nume, int volum, double pret) {
        return switch (tip) {
            case CEAI -> new Ceai(nume, volum, pret);
            case CAFEA -> new Cafea(nume, volum, pret);
            case CIOCOLATACALDA -> new CiocolataCalda(nume, volum, pret);
        };
    }
}
