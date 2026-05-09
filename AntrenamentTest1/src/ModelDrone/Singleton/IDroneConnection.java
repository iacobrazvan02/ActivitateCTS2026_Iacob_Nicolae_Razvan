package ModelDrone.Singleton;

public interface IDroneConnection {
    void conectareUtilizator(String numeUtilizator);
    String getCanal(String numeUtilizator);
}