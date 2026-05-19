package COMPOSITE.COMPOSITE_F6Stb.main;

import COMPOSITE.COMPOSITE_F6Stb.clase.Autobuz;
import COMPOSITE.COMPOSITE_F6Stb.clase.GrupAutobuz;
import COMPOSITE.COMPOSITE_F6Stb.clase.NodFlota;

public class Main {
    public static void main(String[] args){
        NodFlota flotaPrincipala = new GrupAutobuz("Flota totala");
        NodFlota grupuriMici = new GrupAutobuz("Grupuri mic");
        NodFlota grupuriMari = new GrupAutobuz("Grupuri mari");

        NodFlota autobuz1 = new Autobuz("Mercedes", "LUX", 50);
        NodFlota autobuz2 = new Autobuz("Iveco", "Standard", 60);
        NodFlota autobuz3 = new Autobuz("Mercedes", "Standard",55);

        ((GrupAutobuz) flotaPrincipala).adaugaNodFlota(autobuz1);
        ((GrupAutobuz)flotaPrincipala).adaugaNodFlota(autobuz2);
        ((GrupAutobuz)grupuriMici).adaugaNodFlota(autobuz2);
        ((GrupAutobuz)grupuriMari).adaugaNodFlota(autobuz3);
        flotaPrincipala.afiseazaDetaliiGarantie();
        grupuriMari.afiseazaDetaliiGarantie();
        grupuriMici.afiseazaDetaliiGarantie();

        ((GrupAutobuz)flotaPrincipala).stergeNodFlota(autobuz2);
    }
}
