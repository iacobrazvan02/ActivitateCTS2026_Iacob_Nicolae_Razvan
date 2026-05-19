package FLYWEIGHT.FLYWEIGHT_HOTEL.clase;

import java.util.HashMap;
import java.util.Map;

public class CameraFactory {
    public Map<String , ICamera> camere = new HashMap<>();

    public ICamera getTipCamera(String denumire, int nrPaturi, double pretBaza, boolean areBalcon){
        if(camere.containsKey(denumire)){
            System.out.println("Se refoloseste camera deja inregistrata");
            return camere.get(denumire);
        }
        else{
            ICamera tipCamera = new Camera(denumire, pretBaza, nrPaturi, areBalcon);
            System.out.println("Se creeaza un nou obiect de tipul camerei");
            camere.put(denumire, tipCamera);
            return tipCamera;
        }
    }

}
