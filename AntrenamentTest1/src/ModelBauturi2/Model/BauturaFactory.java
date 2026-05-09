package ModelBauturi2.Model;

public class BauturaFactory {
    public static Bautura creareBautura(TipBautura tipBautura, String nume, double volum, double pret) {
        return switch(tipBautura) {
            case Ceai -> new Ceai(nume,volum,pret);
            case Cafea -> new Cafea(nume,volum,pret);
            case CiocolataCalda -> new CiocolataCalda(nume,volum,pret);
        };
    }
}
