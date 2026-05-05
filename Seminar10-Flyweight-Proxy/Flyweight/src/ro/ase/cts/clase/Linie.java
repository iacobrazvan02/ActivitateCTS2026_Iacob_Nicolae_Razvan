package ro.ase.cts.clase;

public class Linie implements LinieDeTransport{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    protected Linie(int nrLinie, String ultimaStatie, String primaStatie) {
        this.nrLinie = nrLinie;
        this.ultimaStatie = ultimaStatie;
        this.primaStatie = primaStatie;
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {
        System.out.print(autobuz);
        System.out.println(this.nrLinie + " " + this.primaStatie + " " + this.ultimaStatie);
    }

    @Override
    public void afiseazaNrMaximDeCalatoriTraseu(Autobuz autobuz) {
        System.out.println("De la statia " + this.primaStatie + " pana la statia " + this.ultimaStatie + " pot merge maxim " + autobuz.getNrLocuri() + " calatori");
    }
}