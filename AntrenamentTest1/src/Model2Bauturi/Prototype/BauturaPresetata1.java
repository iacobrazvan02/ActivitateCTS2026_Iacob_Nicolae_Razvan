package Model2Bauturi.Prototype;

public class BauturaPresetata1 implements PrototypeBauturaPresetata1 {
    private String nume;
    private int volumMililitri;
    private double pret;
    private String aroma;

    public BauturaPresetata1(String nume, int volumMililitri, double pret, String aroma) {
        this.nume = nume;
        this.volumMililitri = volumMililitri;
        this.pret = pret;
        this.aroma = aroma;
    }

    private BauturaPresetata1() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVolumMililitri(int volumMililitri) {
        this.volumMililitri = volumMililitri;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public PrototypeBauturaPresetata1 clone() {
        BauturaPresetata1 b1 = new BauturaPresetata1();
        b1.nume = this.nume;
        b1.volumMililitri = this.volumMililitri;
        b1.pret = this.pret;
        b1.aroma = this.aroma;
        return b1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BauturaPresetata{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volumMililitri=").append(volumMililitri);
        sb.append(", pret=").append(pret);
        sb.append(", aroma='").append(aroma).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
