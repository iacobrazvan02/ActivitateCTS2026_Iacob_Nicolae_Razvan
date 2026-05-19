package FLYWEIGHT.FLYWEIGHT_B10Restaurant.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    public Map<String, ClientRestaurant> clienti = new HashMap<>();

    public ClientRestaurant getClient(String nume, String nrTelefon, String email){
        if(clienti.containsKey(nrTelefon)){
            System.out.println("Se refoloseste clientul existent din memorie pentru: " + nrTelefon);
            return clienti.get(nrTelefon);
        }
        else{
            ClientRestaurant clientRestaurant = new Client(email, nume, nrTelefon);
            clienti.put(nrTelefon, clientRestaurant);
            return clientRestaurant;
        }
    }
}
