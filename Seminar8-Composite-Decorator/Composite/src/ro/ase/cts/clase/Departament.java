package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String nume;
    private List<Structura> lista;

    public Departament(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura) {
        lista.add(structura);
    }

    public void stergeStructura(Structura structura) {
        lista.remove(structura);
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Departamentul " + this.nume + "\n");
        for(Structura structura : lista) {
            structura.afiseazaDetaliiStructura();
        }
    }
}
