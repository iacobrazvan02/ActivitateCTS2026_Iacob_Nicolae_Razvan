package FACADE.FACADE_RestaurantB6.main;

import FACADE.FACADE_RestaurantB6.clase.Client;
import FACADE.FACADE_RestaurantB6.clase.FacadeReceptie_Manager;
import FACADE.FACADE_RestaurantB6.clase.Ospatar;
import FACADE.FACADE_RestaurantB6.clase.SistemMese;

public class Main {
    public static void main(String[] args){
        Client client1 = new Client("Andrei");
        Client client2 = new Client("Raul");
        Client client3 = new Client("Alex");
        SistemMese sistemMese = new SistemMese();
        Ospatar ospatar = new Ospatar();
        FacadeReceptie_Manager  manager = new FacadeReceptie_Manager(sistemMese, ospatar);
        manager.verificaSiAseazaClient(client1, 5);
        manager.verificaSiAseazaClient(client2,2);
        manager.verificaSiAseazaClient(client3, 5);
    }
}
