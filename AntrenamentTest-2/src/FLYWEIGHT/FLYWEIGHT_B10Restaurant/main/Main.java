package FLYWEIGHT.FLYWEIGHT_B10Restaurant.main;

import FLYWEIGHT.FLYWEIGHT_B10Restaurant.clase.ClientFactory;
import FLYWEIGHT.FLYWEIGHT_B10Restaurant.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        Rezervare rezervare = new Rezervare(1, 20, "20:00");
        Rezervare rezervare1 = new Rezervare(2, 15, "18:00");

        ClientFactory clientFactory = new ClientFactory();
        clientFactory.getClient("Ion" , "12323232323", "sdasdsa").afiseazaDetaliiRezervare(rezervare);
        clientFactory.getClient("Matei", "2323123210", "sdadasdasa").afiseazaDetaliiRezervare(rezervare1);
        clientFactory.getClient("Ion" , "12323232323", "sdasdsa").afiseazaDetaliiRezervare(rezervare);
    }
}
