package ModelBauturi2.Model;

public abstract class BauturaAbstracta implements Bautura {
    protected String name;
    protected double volum;
    protected double pret;

    public BauturaAbstracta(String name, double volum, double pret) {
        this.name = name;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bautura{");
        sb.append("name='").append(name).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append("}");
        return sb.toString();
    }
}