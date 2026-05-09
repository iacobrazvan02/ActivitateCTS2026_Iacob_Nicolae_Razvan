package ModelServiceAuto.Main;

import ModelServiceAuto.SimpleFactory.*;
import ModelServiceAuto.Singleton.AMasina;
import ModelServiceAuto.Singleton.IService;
import ModelServiceAuto.Singleton.Service;

public class Main {
    public static void main(String[] args){
        IService service = Service.getInstance();
        AMasina m1 = new SEDAN("A");
        AMasina m2 = new SEDAN("B");
        AMasina m3 = new VAN("C");
        AMasina m4 = new SUV("D");

        service.preiaMasina(m1);
        service.preiaMasina(m2);
        service.preiaMasina(m3);
        service.preiaMasina(m4);
        service.afiseazaMasini();

        service.finalizeazaReparatie();
        System.out.println("\n Service finalizat:\n");
        service.afiseazaMasini();



        AMasina m5 = MasinaFactory.getMasina(MasinaFactoryType.SUV, "Dacia Duster");
        AMasina m6 = MasinaFactory.getMasina(MasinaFactoryType.SEDAN, "Logan");
        AMasina m7 = MasinaFactory.getMasina(MasinaFactoryType.VAN, "VW Transporter");
        AMasina m8 = MasinaFactory.getMasina(MasinaFactoryType.VAN, "Audi Q5");
        service.preiaMasina(m5);
        service.preiaMasina(m6);
        service.preiaMasina(m7);
        service.preiaMasina(m8);
        service.afiseazaMasini();

    }
}
