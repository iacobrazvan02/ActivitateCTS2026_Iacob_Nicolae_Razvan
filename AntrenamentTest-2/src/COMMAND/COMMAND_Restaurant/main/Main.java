package COMMAND.COMMAND_Restaurant.main;

import COMMAND.COMMAND_Restaurant.clase.Bucatar;
import COMMAND.COMMAND_Restaurant.clase.ComandaPreparare;
import COMMAND.COMMAND_Restaurant.clase.ComandaRestaurant;
import COMMAND.COMMAND_Restaurant.clase.Ospatar;

public class Main {
    public static void main(String[] args) {
        Ospatar ospatar = new Ospatar();
        ComandaRestaurant comanda1 = new ComandaPreparare(new Bucatar("Andrei"), "paste");
        ComandaRestaurant comanda2 = new ComandaPreparare(new Bucatar("Alex"), "piure");

        ospatar.adaugaComanda(comanda1);
        ospatar.adaugaComanda(comanda2);
        ospatar.adaugaComanda(new ComandaPreparare(new Bucatar("Matei"), "Supa"));

        ospatar.executaComanda();
        ospatar.executaComanda();
        ospatar.executaComanda();
    }
}