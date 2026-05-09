package ModelServiceAuto.Singleton;

public interface IService {
    // Metodă pentru a introduce o mașină în service
    void preiaMasina(AMasina masina);

    // Metodă pentru a elibera service-ul, astfel încât să poată fi preluată altă mașină
    void finalizeazaReparatie();
    void afiseazaMasini();
}
