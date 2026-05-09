package Model2Bauturi.SimpleFactory;

public class Ceai implements Bautura {
    private String nume;
    private int volumMililitri;
    private double pret;

    public Ceai(double pret, int volumMililitri, String nume) {
        this.pret = pret;
        this.volumMililitri = volumMililitri;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ceai{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volumMililitri=").append(volumMililitri);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void preparare() {
        System.out.printf("Preparare Ceai: " + nume + "Fierbem apa, adaugam pliculet de ceai si servim");

    }

    @Override
    public String getNume() {
        return "";
    }

    @Override
    public double getPret() {
        return 0;
    }
}
