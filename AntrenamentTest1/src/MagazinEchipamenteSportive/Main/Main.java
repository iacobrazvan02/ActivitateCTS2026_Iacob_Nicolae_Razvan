package MagazinEchipamenteSportive.Main;

import MagazinEchipamenteSportive.Factory.Echipament;
import MagazinEchipamenteSportive.Factory.EchipamentFactory;
import MagazinEchipamenteSportive.Factory.EchipamentType;
import MagazinEchipamenteSportive.Singleton.InventoryManager;
import MagazinEchipamenteSportive.Singleton.InventoryManagerSingleton;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //
        Echipament e1 = EchipamentFactory.creareEchipament(EchipamentType.MINGE, "Minge de fotbal", 10);
        Echipament e2 = EchipamentFactory.creareEchipament(EchipamentType.MINGE, "Minge de basket", 15);
        Echipament e3 = EchipamentFactory.creareEchipament(EchipamentType.RACHETA, "Racheta de tenis", 20);
        Echipament e4 = EchipamentFactory.creareEchipament(EchipamentType.GANTE, "Gantera de forta", 25);

        System.out.println("\nAfiseaza echipamentele create:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        InventoryManager cos1 = InventoryManagerSingleton.getInstance();
        InventoryManager cos2 = InventoryManagerSingleton.getInstance();
        InventoryManager cos3 = InventoryManagerSingleton.getInstance();

        System.out.println("\nPrimul cos de cumparaturi:");
        cos1.adaugaEchipament(e1);
        cos1.adaugaEchipament(e2);
        System.out.println(cos1);


        System.out.println("\nAl doilea cos de cumparaturi:");
        cos2.adaugaEchipament(e1);
        cos2.adaugaEchipament(e2);
        System.out.println(cos2);

        System.out.println("\nAl treilea cos de cumparaturi:" );
        cos3.adaugaEchipament(e1);
        cos3.adaugaEchipament(e4);
        System.out.println(cos3);

        System.out.println("\nAfiseaza toate echipamentele din cosul2\n" + cos2);
        cos2.afiseazaToateEchipamentele();

        System.out.println("\nAfiseaza valoare totala stoc din cosul2\n" + cos2.calculeazaValoareTotalaStoc());
        cos2.calculeazaValoareTotalaStoc();

        System.out.println("\nGoleste cosul 3");
        cos3.golesteStoc();







    }
}
