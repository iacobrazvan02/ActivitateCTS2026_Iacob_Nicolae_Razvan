package ro.ase.cts.stb.vehicule;

public class Tramvai extends MijlocTransport{

    public Tramvai(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tramvai {"+super.toString()+"}");
    }
}