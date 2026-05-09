package ModelBauturi3.Factory;

import ModelBauturi3.Model.*;

public class BauturaFactory {
    public static Bautura creareBautura(BauturaType tip, String nume, int volumMililitri, double pret ){
        if(tip == BauturaType.CAFEA){
            return new Cafea(pret, volumMililitri, nume);
        }
        if(tip == BauturaType.CEAI) {
            return new Ceai(pret, volumMililitri, nume);
        }
        if(tip == BauturaType.CIOCOLATACALDA) {
            return new CiocolataCalda(pret, volumMililitri, nume);
        }
        System.out.println("Tip invalid");
        return null;
    }
}
