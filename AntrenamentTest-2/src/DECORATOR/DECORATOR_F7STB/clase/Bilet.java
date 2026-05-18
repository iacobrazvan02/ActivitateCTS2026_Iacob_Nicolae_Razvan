package DECORATOR.DECORATOR_F7STB.clase;

public class Bilet implements BiletAbstract {
    private String linie;
    private double pret;

    public Bilet(String linie, double pret) {
        this.linie = linie;
        this.pret = pret;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Bilet valid pentru linia " + this.linie + ". Pret: " + this.pret + " lei.");
    }
}