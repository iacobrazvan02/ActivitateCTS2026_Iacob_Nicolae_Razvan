package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaFelDeMancare;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();
        FabricaFelDeMancare fabricaFelDeMancareDesert = new FabricaDesert();

        FelDeMancare supaDeVita = fabricaFelDeMancare.creeareFelDeMancare(TipSupa.SupaDeVita,200,30.50);
        FelDeMancare supaDeLegume = fabricaFelDeMancare.creeareFelDeMancare(TipSupa.SupaDeLegume, 150, 20.50);

        FelDeMancare clatite = fabricaFelDeMancareDesert.creeareFelDeMancare(TipDesert.Clatite, 250, 15.50, 600);
        FelDeMancare papanasi = fabricaFelDeMancareDesert.creeareFelDeMancare(TipDesert.Papanasi, 300, 25.50, 900);

        supaDeVita.afisareDescriere();
        supaDeLegume.afisareDescriere();

        clatite.afisareDescriere();
        papanasi.afisareDescriere();
    }
}