package MagazinEchipamenteSportive.Singleton;

import MagazinEchipamenteSportive.Factory.Echipament;

public interface InventoryManager {
    void adaugaEchipament(Echipament echipament);
    void afiseazaToateEchipamentele();
    double calculeazaValoareTotalaStoc();
    void golesteStoc();
}