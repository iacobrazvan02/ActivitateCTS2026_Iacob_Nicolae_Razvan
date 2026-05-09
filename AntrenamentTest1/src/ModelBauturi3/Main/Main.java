package ModelBauturi3.Main;

import ModelBauturi3.Factory.BauturaFactory;
import ModelBauturi3.Model.Bautura;
import ModelBauturi3.Model.CasaDeMarcat;
import ModelBauturi3.Model.ComandaManager;

import static ModelBauturi3.Factory.BauturaType.*;

public class Main {
    public static void main(String[] args){

        // Testare Factory- crearea a 4 elemente
        Bautura b1 = BauturaFactory.creareBautura(CAFEA, "Cappucino", 150, 10);
        Bautura b2 = BauturaFactory.creareBautura(CEAI, "Ceai de menta", 300, 15);
        Bautura b3 = BauturaFactory.creareBautura(CIOCOLATACALDA, "Ciocolata alba", 200, 13);
        Bautura b4 = BauturaFactory.creareBautura(CAFEA, "Espresso", 100, 9);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        ComandaManager comanda1 = CasaDeMarcat.getInstance();
        ComandaManager comanda2 = CasaDeMarcat.getInstance();
        System.out.println("\nPrima comanda\n");
        comanda1.adaugaBautura(b1);
        comanda1.adaugaBautura(b2);
        comanda1.adaugaBautura(b3);
        comanda1.afiseazaDetaliiComanda();
        comanda1.finalizeazaComanda();

        System.out.println("\nA doua comanda\n");
        comanda2.adaugaBautura(b1);
        comanda2.adaugaBautura(b4);
        comanda2.afiseazaDetaliiComanda();



    }
}
