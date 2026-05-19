package COMPOSITE.COMPOSITE_B8Restaurant.clase;

public class ItemProdus implements MeniuComponenta{
    private String nume;
    private double pret;

    public ItemProdus(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetaliiMeniu() {
        System.out.println("Meniul are produse" + this.nume + "la pretul " + this.pret);
    }
}
