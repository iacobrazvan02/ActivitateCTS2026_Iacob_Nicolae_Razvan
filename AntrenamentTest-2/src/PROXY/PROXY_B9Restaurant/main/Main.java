package PROXY.PROXY_B9Restaurant.main;

import PROXY.PROXY_B9Restaurant.clase.IRezervare;
import PROXY.PROXY_B9Restaurant.clase.ProxyRezervare;
import PROXY.PROXY_B9Restaurant.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        IRezervare rezervareBuna = new Rezervare("Matei", 5);
        IRezervare rezervareRea = new Rezervare("Adrian", 3);

        IRezervare iRezervareBuna = new ProxyRezervare(rezervareBuna);
        IRezervare iRezervareRea = new ProxyRezervare(rezervareRea);

        iRezervareBuna.rezervaMasa();
        System.out.println("");
        iRezervareRea.rezervaMasa();
    }
}
