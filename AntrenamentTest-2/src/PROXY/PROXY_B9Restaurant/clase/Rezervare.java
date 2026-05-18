package PROXY.PROXY_B9Restaurant.clase;

public class Rezervare implements IRezervare{
    private String numeClient;
    private int nrPersoane;

    public Rezervare(String numeClient, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void rezervaMasa() {
        System.out.println("A fost rezervata masa cu succes de clientul " + numeClient);
    }

    @Override
    public int getNrPersoane() {
        return nrPersoane;
    }
}
