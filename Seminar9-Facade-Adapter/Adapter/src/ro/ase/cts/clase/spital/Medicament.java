package ro.ase.cts.clase.spital;

public class Medicament {
    private String name;
    private double price;

    public String getNume() {
        return name;
    }
    public Medicament(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void achizitioneazaMedicament() {
        if(prezintaReteta()) {
            System.out.println("Este achizitionat medicamentul " + this.name + " la pretul" + this.price);
        } else {
            System.out.println("Pentru mendicament " + this.name + " este nevoie de o reteta.");
        }
    }
    private boolean prezintaReteta() {
        return name.contains("reteta");
    }
}