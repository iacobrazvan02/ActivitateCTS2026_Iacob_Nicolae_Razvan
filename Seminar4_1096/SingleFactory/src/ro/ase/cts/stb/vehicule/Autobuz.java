package ro.ase.cts.stb.vehicule;

public class Autobuz extends MijlocTransport{

    public Autobuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuz {"+super.toString()+"}");
    }
}