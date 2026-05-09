package ModelBauturi3.Model;

public class CiocolataCalda implements Bautura {
    private String nume;
    private int volumMililitri;
    private double pret;

    public CiocolataCalda(double pret, int volumMililitri, String nume) {
        this.pret = pret;
        this.volumMililitri = volumMililitri;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CiocolataCalda{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volumMililitri=").append(volumMililitri);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void preparare() {
        System.out.printf("Preaparam ciocolata calda:" + nume + "Fierbem apa, adaugam ciocolata si servim");

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
