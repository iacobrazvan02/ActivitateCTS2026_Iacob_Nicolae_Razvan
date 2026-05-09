package Model1Bauturi.Factory.Model;

public class Cafea implements Bautura{
    private String nume;
    private int volum;
    double pret;

    public Cafea(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void preparare() {
        System.out.println("Preparare cafea:  Macinam boabele, fierbem apa, punem cafea in apa, servim in ceasca" );
    }

    @Override
    public String getNume() {
        return this.getNume();
    }

    @Override
    public double getPret() {
        return this.getPret();
    }
}
