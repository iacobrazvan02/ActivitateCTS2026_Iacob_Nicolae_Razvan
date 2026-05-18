package PROXY.PROXY_H2Hotel.main;

import PROXY.PROXY_H2Hotel.clase.IRezervareHotel;
import PROXY.PROXY_H2Hotel.clase.ProxyRezervare;
import PROXY.PROXY_H2Hotel.clase.RezervareLux;

public class Main {
    public static void main(String[] args){
        IRezervareHotel rezervareHotelBuna = new RezervareLux(true);
        IRezervareHotel rezervareHotelProasta = new RezervareLux(false);

        IRezervareHotel proxyRezervareHotelBuna = new ProxyRezervare(rezervareHotelBuna);
        IRezervareHotel proxyRezervareHotelProasta = new ProxyRezervare(rezervareHotelProasta);

        proxyRezervareHotelBuna.rezervaApartament();
        proxyRezervareHotelProasta.rezervaApartament();
    }
}
