package ro.ase.cts.clase;

public class Plecare implements Comanda{
    private Autobuz autobuz;
    private int numarLinie;

    public Plecare(Autobuz autobuz, int numarLinie) {
        this.autobuz = autobuz;
        this.numarLinie = numarLinie;
    }

    @Override
    public void pleacaInCursa() {
        autobuz.pornestePeTraseu(numarLinie);
    }


}
