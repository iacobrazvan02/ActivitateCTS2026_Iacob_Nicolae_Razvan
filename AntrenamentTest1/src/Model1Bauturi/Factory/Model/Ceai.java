package Model1Bauturi.Factory.Model;

public class Ceai implements Bautura{
    private String nume;
    private int volum;
    double pret;

    public Ceai(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ceai{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void preparare() {
        System.out.println("Preparare ceai:  Fierbem apa, adaugam pliculet si gata de servire" );
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
