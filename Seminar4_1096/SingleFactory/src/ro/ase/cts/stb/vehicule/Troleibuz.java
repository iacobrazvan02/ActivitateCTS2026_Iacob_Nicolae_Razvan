package ro.ase.cts.stb.vehicule;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuz {"+super.toString()+"}");
    }
}