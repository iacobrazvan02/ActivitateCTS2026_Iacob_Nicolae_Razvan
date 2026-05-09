package MagazinEchipamenteSportive.Factory;

public class Racheta implements Echipament{
    private String nume;
    private double pret;

    public Racheta(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Racheta{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("nume" + nume + "\npret:" + pret);
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public void efectueazaIntretinere() {

    }
}