package ro.ase.cts.clase.farmacie;

public class Medicament {
    private String name;

    public Medicament(String name) {
        this.name = name;
    }

    public void cumparaMedicament() {
        System.out.println("Este cumparat medicamentul " + this.name);
    }
}