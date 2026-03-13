package ro.ase.cts.stb.factory;

import ro.ase.cts.stb.vehicule.Autobuz;
import ro.ase.cts.stb.vehicule.MijlocTransport;
import ro.ase.cts.stb.vehicule.Tramvai;
import ro.ase.cts.stb.vehicule.Troleibuz;

public class MijlocTransportFactorySingleton {
    public static MijlocTransportFactorySingleton instance;

    private MijlocTransportFactorySingleton() {
    }

    public static MijlocTransportFactorySingleton getInstance(){
        if (instance==null){
            instance=new MijlocTransportFactorySingleton();
        }
        return instance;
    }

    public MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip){
        if(tip==MijlocTransportType.AUTOBUZ){
            return new Autobuz(marca,linie);
        }
        if(tip==MijlocTransportType.TRAMVAI){
            return new Tramvai(marca,linie);
        }
        if (tip==MijlocTransportType.TROLEIBUZ) {
            return new Troleibuz(marca,linie);
        }
        System.out.println("Tip invalid!");
        return null;
    }
}