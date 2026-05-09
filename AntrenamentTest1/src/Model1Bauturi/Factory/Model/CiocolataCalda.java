package Model1Bauturi.Factory.Model;

public class CiocolataCalda implements Bautura{
    private String nume;
    private int volum;
    double pret;

    public CiocolataCalda(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CiocolataCalda{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void preparare() {
        System.out.println("Preparare ciocolata calda:  Punem apa la fiert, adaugam ciocolata, gata de servire in ceasca" );
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
