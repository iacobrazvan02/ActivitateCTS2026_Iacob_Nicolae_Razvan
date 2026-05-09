package Model1Bauturi.Singleton;

import Model1Bauturi.Factory.Model.Bautura;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements ISingletone{
    private static Comanda instanta = null;
    private List<Bautura>  listBautura;
    private Comanda(){
        this.listBautura = new ArrayList<>();
    }
    public static synchronized Comanda getInstance(){
        if(instanta == null) {
            instanta = new Comanda();
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("listBautura=").append(listBautura);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void adaugaBautura(Bautura bautura) {
        listBautura.add(bautura);
    }

    @Override
    public void afiseazaDetaliiComanda() {
        System.out.println("Produsele din comanda");
        listBautura.forEach(System.out::println);
    }

    @Override
    public double calculeazaPretTotal() {
        double total = 0;
        for(Bautura bautura1 : listBautura ){
            total += bautura1.getPret();
        }
        return total;
    }

    @Override
    public void finalizeazaComanda() {
        System.out.println("Comanda a fost finalizata");
        listBautura.clear();
    }
}
