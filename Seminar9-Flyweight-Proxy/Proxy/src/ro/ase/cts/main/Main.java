package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzDeNoapte;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport mijlocDeTransport = new Autobuz("420", 30);
        mijlocDeTransport.opresteInStatie();
        mijlocDeTransport.opresteInStatie();

        MijlocDeTransport autobuzDeNoapte = new AutobuzDeNoapte(mijlocDeTransport);
        autobuzDeNoapte.opresteInStatie();

        MijlocDeTransport mijlocDeTransportGol = new Autobuz("512", 0);
        mijlocDeTransportGol.opresteInStatie();

        MijlocDeTransport autobuzDeNoapteGol = new AutobuzDeNoapte(mijlocDeTransportGol);
        autobuzDeNoapteGol.opresteInStatie();

        MijlocDeTransport mijlocDeTransportSpecial = new Autobuz("100Speciala", 20);
        MijlocDeTransport autobuzSpecial = new AutobuzCursaSpeciala(mijlocDeTransportSpecial);

        autobuzSpecial.opresteInStatie();
    }

}