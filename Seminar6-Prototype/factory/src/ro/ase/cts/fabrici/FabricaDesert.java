package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipFelDeMancare;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret) {
        return creeareFelDeMancare(tipFelDeMancare,gramaj,pret,500);
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int nrCalorii) {
        return switch(tipFelDeMancare) {
            case TipDesert.Clatite -> new Clatite(nrCalorii,gramaj,pret);
            case TipDesert.Papanasi -> new Papanasi(nrCalorii,gramaj,pret);
            default -> null;
        };
    }
}