package FLYWEIGHT.FLYWEIGHT_A10Spital.clase;

import PROXY.PROXY_A9Spital.clase.IPacient;

import java.util.HashMap;
import java.util.Map;

public class PacientFactory {
    public Map<String , IPacientSpital> pacienti = new HashMap<>();

    public IPacientSpital getPacienti(String nume, String nrTelefon, String adresa){
        if(pacienti.containsKey(adresa)){
            System.out.println("Pacientul a fost deja inregistrat pentru pacientul cu: " + adresa);
            return pacienti.get(adresa);
        }
        else{
            IPacientSpital iPacientSpital = new Pacient(nume, nrTelefon, adresa);
            pacienti.put(adresa, iPacientSpital);
            return iPacientSpital;
        }
    }
}
