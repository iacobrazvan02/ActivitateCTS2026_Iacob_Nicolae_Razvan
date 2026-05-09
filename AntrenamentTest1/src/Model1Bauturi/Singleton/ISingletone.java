package Model1Bauturi.Singleton;


import Model1Bauturi.Factory.Model.Bautura;

public interface ISingletone {
        void adaugaBautura(Bautura bautura);
        void afiseazaDetaliiComanda();
        double calculeazaPretTotal();
        void finalizeazaComanda();
    }

