package OBSERVER.OBSERVER_STB.clase;

import java.util.ArrayList;
import java.util.List;

public class DispeceratSTB implements ICompanieSTB {
    private String zona;
    private List<Calator> listaCalatori = new ArrayList<>();

    public DispeceratSTB(String zona) {
        this.zona = zona;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Calator calator : listaCalatori) {
            calator.receptioneazaNotificare(mesaj + " [Dispecerat " + this.zona + "]");
        }
    }

    @Override
    public void aboneazaCalator(Calator calator) {
        listaCalatori.add(calator);
    }

    @Override
    public void dezaboneazaCalator(Calator calator) {
        listaCalatori.remove(calator);
    }

    public void notificaIntarziere() {
        trimiteMesaj("Autobuzul are o intarziere de 15 minute.");
    }

    public void notificaDeviere() {
        trimiteMesaj("Traseul a fost deviat din cauza unor lucrari!");
    }
}