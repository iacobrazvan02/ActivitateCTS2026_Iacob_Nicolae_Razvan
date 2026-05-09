package MagazinEchipamenteSportive.Factory;

public class EchipamentFactory {
    public static Echipament creareEchipament(EchipamentType tip, String nume, double pret) {
        if (tip == EchipamentType.MINGE) {
            return new Minge(nume, pret);
        }
        if (tip == EchipamentType.RACHETA) {
            return new Racheta(nume, pret);
        }
        if (tip == EchipamentType.GANTE) {
            return new Gante(nume, pret);
        }
        System.out.println("Tip invalid");
        return null;
    }
}
