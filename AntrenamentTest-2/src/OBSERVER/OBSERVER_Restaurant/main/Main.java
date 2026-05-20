package OBSERVER.OBSERVER_Restaurant.main;

import OBSERVER.OBSERVER_Restaurant.clase.Client;
import OBSERVER.OBSERVER_Restaurant.clase.ClientAbonat;
import OBSERVER.OBSERVER_Restaurant.clase.IRestaurant;
import OBSERVER.OBSERVER_Restaurant.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Client client1 = new ClientAbonat("Razvan", "031232312");
        Client client2 = new ClientAbonat("Andrei", "31231233133");

        IRestaurant restaurant = new Restaurant("Trattoria");
        restaurant.aboneazaClient(client1);
        restaurant.aboneazaClient(client2);

        ((Restaurant) restaurant).notificaOfertaNoua();

        restaurant.dezaboneazaClient(client1);
        ((Restaurant) restaurant).notificaMeniuNou();
    }
}