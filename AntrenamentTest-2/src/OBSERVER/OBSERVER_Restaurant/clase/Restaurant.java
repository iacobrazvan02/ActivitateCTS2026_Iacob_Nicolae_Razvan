package OBSERVER.OBSERVER_Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    private String numeRestaurant;
    private List<Client> listaClienti = new ArrayList<>();

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Client client : listaClienti) {
            client.receptioneazaNotificare(mesaj + " cu drag, " + this.numeRestaurant);
        }
    }

    @Override
    public void aboneazaClient(Client client) {
        listaClienti.add(client);
    }

    @Override
    public void dezaboneazaClient(Client client) {
        listaClienti.remove(client);
    }

    public void notificaOfertaNoua() {
        trimiteMesaj("Avem o reducere de 50% la toate pizzele!");
    }

    public void notificaMeniuNou() {
        trimiteMesaj("Am introdus burgeri noi in meniu!");
    }
}