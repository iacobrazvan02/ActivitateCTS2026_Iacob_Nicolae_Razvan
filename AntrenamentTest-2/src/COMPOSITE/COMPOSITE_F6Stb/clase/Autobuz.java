package COMPOSITE.COMPOSITE_F6Stb.clase;

public class Autobuz implements NodFlota{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDetaliiGarantie() {
        System.out.println("Garantia de la producatorul " + this.producator + " pentru modelul " +
                this.model + " cu numarul de locuri " + this.nrLocuri);
    }
}
