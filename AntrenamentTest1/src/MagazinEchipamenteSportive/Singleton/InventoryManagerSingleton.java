package MagazinEchipamenteSportive.Singleton;

import MagazinEchipamenteSportive.Factory.Echipament;
import MagazinEchipamenteSportive.Factory.EchipamentType;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagerSingleton implements InventoryManager{
    private List<Echipament> listaEchipament;
    private static InventoryManagerSingleton instanta = null;

    private InventoryManagerSingleton() {
        this.listaEchipament = new ArrayList<>();
    }

    public static synchronized InventoryManagerSingleton getInstance(){
        if(instanta == null) {
            instanta = new InventoryManagerSingleton();
        }
        return instanta;
    }

    @Override
    public void adaugaEchipament(Echipament echipament) {
        listaEchipament.add(echipament);
    }

    @Override
    public void afiseazaToateEchipamentele() {
        System.out.println("Afiseaza toate echipamentele:");
        listaEchipament.forEach(System.out::println);
    }

    @Override
    public double calculeazaValoareTotalaStoc() {
        double total = 0;
        for(Echipament echipament1: listaEchipament){
            total += echipament1.getPret();
        }
        return total;
    }

    @Override
    public void golesteStoc() {
        System.out.println("Nu mai avem nimic in stoc");
        listaEchipament.clear();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InventoryManagerSingleton{");
        sb.append("listaEchipament=").append(listaEchipament);
        sb.append('}');
        return sb.toString();
    }
}
