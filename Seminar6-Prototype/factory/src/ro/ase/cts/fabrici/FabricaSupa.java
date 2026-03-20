package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.clase.SupaDeVita;
import ro.ase.cts.enums.TipFelDeMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa implements  FabricaFelDeMancare{
    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret) {
        return switch (tipFelDeMancare) {
            case TipSupa.SupaDeLegume -> new SupaDeLegume(gramaj, pret);
            case TipSupa.SupaDeVita -> new SupaDeVita(gramaj, pret);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int nrCalorii) {
        return creeareFelDeMancare(tipFelDeMancare,gramaj,pret);
    }
}