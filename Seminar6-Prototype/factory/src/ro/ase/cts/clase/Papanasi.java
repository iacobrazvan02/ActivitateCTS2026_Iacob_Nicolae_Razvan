package ro.ase.cts.clase;

public class Papanasi extends Desert{
    public Papanasi(int calorii, int gramaj, double pret) {
        super(calorii, gramaj, pret);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Papanasi: " + super.toString());
    }
}