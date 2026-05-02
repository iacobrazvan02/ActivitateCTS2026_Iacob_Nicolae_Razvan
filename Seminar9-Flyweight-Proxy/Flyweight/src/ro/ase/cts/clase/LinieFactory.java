package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    public Map<Integer, LinieDeTransport> linii = new HashMap<>();

    public LinieDeTransport getLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        if(linii.containsKey(nrLinie)) {
            return linii.get(nrLinie);
        } else {
            LinieDeTransport linieDeTransport = new Linie(nrLinie, primaStatie, ultimaStatie);
            linii.put(nrLinie, linieDeTransport);
            return linieDeTransport;
        }
    }
}