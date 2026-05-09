package Model2Bauturi.SimpleFactory;

public class Cafea implements Bautura {
    private String nume;
    private int volumMililitri;
    private double pret;

    public Cafea(double pret, int volumMililitri, String nume) {
        this.pret = pret;
        this.volumMililitri = volumMililitri;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volumMililitri=").append(volumMililitri);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void preparare() {
        System.out.println("Asa se prepara cafeaua: " + nume + "Fierbem apa, adaugam zat, gata de servire in ceasca");
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
