package Model2Bauturi.Main;

import ModelBauturi2.Model.*;
import Model2Bauturi.Prototype.BauturaPresetata1;
import Model2Bauturi.Prototype.PrototypeBauturaPresetata1;

public class Main {
    public static void main(String[] args){
                Bautura machiatto = BauturaFactory.creareBautura(TipBautura.Cafea,"MACHIATTO",300.0,32.5);
                Bautura milceai = BauturaFactory.creareBautura(TipBautura.Ceai,"milceai",400.0,20.5);
                Bautura milcioco = BauturaFactory.creareBautura(TipBautura.CiocolataCalda,"milcioco",250.0,15.5);

                System.out.println(machiatto);
                System.out.println(milceai);
                System.out.println(milcioco);

        PrototypeBauturaPresetata1 bauturaPresetata = new BauturaPresetata1("cafea",150, 15.0,"vanilie");





    }
}
