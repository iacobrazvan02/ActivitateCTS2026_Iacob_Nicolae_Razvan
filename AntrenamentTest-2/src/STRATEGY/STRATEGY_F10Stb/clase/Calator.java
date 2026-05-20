package STRATEGY.STRATEGY_F10Stb.clase;

public class Calator {
    private String nume;
    private ModPlataCalatorie modPlata;

    public Calator(String nume, ModPlataCalatorie modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public Calator(String nume) {
        this.nume = nume;
        this.modPlata = new CardCalatorii();
    }

    public void setModPlata(ModPlataCalatorie modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteBilet(double suma) {
        System.out.print("Calatorul " + this.nume + " ");
        modPlata.plateste(suma);
    }
}