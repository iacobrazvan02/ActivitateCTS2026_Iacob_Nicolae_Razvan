package Model1Bauturi.Main;

import ModelBauturi3.Factory.BauturaType;
import Model1Bauturi.Factory.Model.Bautura;
import Model1Bauturi.Factory.Model.BauturaFactory;
import Model1Bauturi.Singleton.Comanda;

public class Main {
    public static void main(String[] args){
        BauturaFactory b1 = new BauturaFactory();
        Bautura b2 = b1.creareBautura(BauturaType.CAFEA, "Espresso", 150, 10);
        Bautura b3 = b1.creareBautura(BauturaType.CEAI, "Ceai de menta", 200, 15);
        Bautura b4 = b1.creareBautura(BauturaType.CIOCOLATACALDA, "Ciocolata", 400, 20);

        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        Comanda comanda1 = Comanda.getInstance();
        Comanda comanda2 = Comanda.getInstance();

        comanda1.adaugaBautura(b2);
        comanda1.adaugaBautura(b3);
        comanda1.adaugaBautura(b4);

        comanda2.adaugaBautura(b3);
        System.out.println(comanda1);
        System.out.println(comanda2);
    }
}
