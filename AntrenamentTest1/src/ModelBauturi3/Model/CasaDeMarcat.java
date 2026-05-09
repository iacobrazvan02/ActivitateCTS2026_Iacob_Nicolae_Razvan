package ModelBauturi3.Model;

import java.util.ArrayList;
import java.util.List;

public class CasaDeMarcat implements ComandaManager {
    private List<Bautura> listaBauturi;
    private static CasaDeMarcat instanta = null;

    private CasaDeMarcat() {
        this.listaBauturi = new ArrayList<>();
    }

    public static synchronized CasaDeMarcat getInstance() {
        if(instanta == null) {
            instanta = new CasaDeMarcat();
        }
        return instanta;
    }

    @Override
    public void adaugaBautura(Bautura bautura) {
        listaBauturi.add(bautura);
    }

    @Override
    public void afiseazaDetaliiComanda() {
        System.out.println("Produse din comanda:");
        listaBauturi.forEach(System.out::println);
    }

    @Override
    public double calculeazaPretTotal() {
        double total = 0;
        for(Bautura bautura1 :listaBauturi) {
            total += bautura1.getPret();
        }
        return total;
    }

    @Override
    public void finalizeazaComanda() {
        System.out.println("Comanda a fost finalizata");
       listaBauturi.clear();
    }
}
