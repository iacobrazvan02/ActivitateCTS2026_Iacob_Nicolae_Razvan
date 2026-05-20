package STRATEGY.STRATEGY_A11Spital.clase;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public Pacient(String nume) {
        this.nume = nume;
        this.modPlata = new PlataCash();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void efectueazaPlata(double suma) {
        System.out.print("Pacientul " + this.nume + " -> ");
        modPlata.plateste(suma);
    }
}