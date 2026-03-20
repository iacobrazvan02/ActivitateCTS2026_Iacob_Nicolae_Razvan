package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret);
    FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int nrCalorii);
}