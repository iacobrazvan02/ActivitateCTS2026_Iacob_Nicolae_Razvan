package COMPOSITE.COMPOSITE_B8Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements MeniuComponenta{
    private String nume;
    private List<MeniuComponenta> lista;

    public SectiuneMeniu(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public void adaugaMeniuComponenta(MeniuComponenta meniuComponenta){
        lista.add(meniuComponenta);
    }

    public void stergeMeniuComponenta(MeniuComponenta meniuComponenta){
        lista.remove(meniuComponenta);
    }

    @Override
    public void afiseazaDetaliiMeniu() {
        System.out.println("Sectiunea meniu + " + this.nume + "\n");
        for(MeniuComponenta meniuComponenta : lista){
            meniuComponenta.afiseazaDetaliiMeniu();
        }
    }
}
