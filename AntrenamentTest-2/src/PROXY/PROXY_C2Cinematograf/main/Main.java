package PROXY.PROXY_C2Cinematograf.main;

import PROXY.PROXY_C2Cinematograf.clase.IVanzareBilet;
import PROXY.PROXY_C2Cinematograf.clase.ProxyVanzareBilet;
import PROXY.PROXY_C2Cinematograf.clase.VanzareBilet;

public class Main {
    public static void main(String[] args){
        IVanzareBilet vanzareBiletBuna = new VanzareBilet(19, "Matei");
        IVanzareBilet vanzareBiletProasta = new VanzareBilet(15, "Alex");

        IVanzareBilet proxyVanzareBiletBuna = new ProxyVanzareBilet(vanzareBiletBuna);
        IVanzareBilet proxyVanzareBiletProasa = new ProxyVanzareBilet(vanzareBiletProasta);

        proxyVanzareBiletBuna.vanzareBilet();
        proxyVanzareBiletProasa.vanzareBilet();

    }
}
