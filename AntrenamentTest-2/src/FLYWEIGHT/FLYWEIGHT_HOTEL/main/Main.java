package FLYWEIGHT.FLYWEIGHT_HOTEL.main;

import FLYWEIGHT.FLYWEIGHT_HOTEL.clase.CameraFactory;
import FLYWEIGHT.FLYWEIGHT_HOTEL.clase.Cazare;

public class Main {
    public static void main(String[] args){
        Cazare cazare1 = new Cazare("Mihai", 12, "12.04.2026");
        Cazare cazare2 = new Cazare("Matei", 12, "12.04.2026");
        Cazare cazare3 = new Cazare("Marian", 12, "13.04.2026");

        CameraFactory cameraFactory1 = new CameraFactory();
        cameraFactory1.getTipCamera("Deluxe", 2, 200, true).afiseazaDetaliiCazare(cazare1);
        cameraFactory1.getTipCamera("Standard",1,100,false).afiseazaDetaliiCazare(cazare2);
        cameraFactory1.getTipCamera("Deluxe", 2, 200, true).afiseazaDetaliiCazare(cazare1);
    }
}
