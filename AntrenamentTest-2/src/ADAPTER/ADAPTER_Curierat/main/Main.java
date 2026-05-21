package ADAPTER.ADAPTER_Curierat.main;

import ADAPTER.ADAPTER_Curierat.clase.AbstractColet;
import ADAPTER.ADAPTER_Curierat.clase.ColetDrona;
import ADAPTER.ADAPTER_Curierat.clase.ColetDronaAdapter;
import ADAPTER.ADAPTER_Curierat.clase.ColetIntern;

public class Main {
    public static void main (String[] args){
        AbstractColet coletIntern = new ColetIntern("Mihai", "weiner", 20);
        ColetDrona coletDrona = new ColetDrona("44.17", "Matei", 15);

        AbstractColet adapter = new ColetDronaAdapter(coletDrona);
        System.out.println("colet intern:");
        proceseazaColet(coletIntern);

        System.out.println("colet drona");
        proceseazaColet(adapter);
    }
    private static void proceseazaColet(AbstractColet colet) {
        System.out.println("Destinatar: " + colet.obtineNumeDestinatar());
        System.out.println("Adresa: " + colet.obtineAdresaLivrare());
        System.out.println("Greutate: " + colet.obtineGreutate() + " kg");
    }
}
