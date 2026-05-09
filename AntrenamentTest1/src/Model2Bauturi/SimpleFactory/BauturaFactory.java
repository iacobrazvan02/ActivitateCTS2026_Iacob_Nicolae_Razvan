package Model2Bauturi.SimpleFactory;

import ModelBauturi3.Factory.BauturaType;
import ModelBauturi3.Model.Bautura;
import ModelBauturi3.Model.Cafea;
import ModelBauturi3.Model.Ceai;
import ModelBauturi3.Model.CiocolataCalda;

public class BauturaFactory {
    public static Bautura creareBautura(ModelBauturi3.Factory.BauturaType tip, String nume, int volumMililitri, double pret ){
        if(tip == ModelBauturi3.Factory.BauturaType.CAFEA){
            return new Cafea(pret, volumMililitri, nume);
        }
        if(tip == ModelBauturi3.Factory.BauturaType.CEAI) {
            return new Ceai(pret, volumMililitri, nume);
        }
        if(tip == BauturaType.CIOCOLATACALDA) {
            return new CiocolataCalda(pret, volumMililitri, nume);
        }
        System.out.println("Tip invalid");
        return null;
    }
}
