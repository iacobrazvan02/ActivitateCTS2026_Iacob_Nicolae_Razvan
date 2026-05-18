package FACADE.FACADE_STBF5.main;

import FACADE.FACADE_STBF5.clase.PanouFacade;
import FACADE.FACADE_STBF5.clase.Sofer;
import FACADE.FACADE_STBF5.clase.Usa;

public class Main {
    public static void main(String[] args){
        Sofer sofer1 = new Sofer("Marcel");

        Usa usaInceput = new Usa("Fata");
        Usa usaMijloc = new Usa("Mijloc");
        Usa usaSpate = new Usa("Spate");

        PanouFacade panouControl = new PanouFacade(usaInceput, usaMijloc, usaSpate);
        panouControl.deschideFortatToateUsile(sofer1);
        System.out.println("");
        panouControl.deschideNormalToateUsile(sofer1);
    }
}
