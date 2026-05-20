package OBSERVER.OBSERVER_Restaurant.clase;

public interface IRestaurant {
    void trimiteMesaj(String mesaj);
    void aboneazaClient(Client client);
    void dezaboneazaClient(Client client);
}