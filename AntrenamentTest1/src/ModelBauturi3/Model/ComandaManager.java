package ModelBauturi3.Model;

public interface ComandaManager {
    void adaugaBautura(Bautura bautura);
    void afiseazaDetaliiComanda();
    double calculeazaPretTotal();
    void finalizeazaComanda();
}
