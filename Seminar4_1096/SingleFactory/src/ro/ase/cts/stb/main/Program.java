package ro.ase.cts.stb.main;

import ro.ase.cts.stb.factory.MijlocTransportFactory;
import ro.ase.cts.stb.factory.MijlocTransportFactorySingleton;
import ro.ase.cts.stb.factory.MijlocTransportType;
import ro.ase.cts.stb.vehicule.MijlocTransport;

public class Program {
    public static void afisareMijlocTransport(MijlocTransport mijlocTransport){
        mijlocTransport.afiseazaDescriere();
    }

    public static void main(String[] args){
        MijlocTransport autobuz= MijlocTransportFactory.getMijlocTransport("Mercedes",139, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai = MijlocTransportFactory.getMijlocTransport("Astra",32,MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz= MijlocTransportFactory.getMijlocTransport("OTOKAR",97,MijlocTransportType.TROLEIBUZ);

        MijlocTransportFactorySingleton factory=MijlocTransportFactorySingleton.getInstance();

        MijlocTransport autobuzSingleton= factory.getMijlocTransport("Mercedes",139, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvaiSingleton = factory.getMijlocTransport("Astra",32,MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuzSingleton= factory.getMijlocTransport("OTOKAR",97,MijlocTransportType.TROLEIBUZ);

        System.out.println("Single Factory: ");
        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
        afisareMijlocTransport(troleibuz);

        System.out.println("Singleton: ");
        afisareMijlocTransport(autobuzSingleton);
        afisareMijlocTransport(tramvaiSingleton);
        afisareMijlocTransport(troleibuzSingleton);
    }
}