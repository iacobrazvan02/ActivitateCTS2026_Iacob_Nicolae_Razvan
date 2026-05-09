package ModelDrone.Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DroneConnection implements IDroneConnection{
        private static DroneConnection instanta = null;

        private Map<String, String> canaleUtilizatori;

        private DroneConnection() {
            this.canaleUtilizatori = new HashMap<>();
            System.out.println("Sistemul central de comunicatie a fost initializat.");
        }

        public static synchronized DroneConnection getInstanta() {
            if (instanta == null) {
                instanta = new DroneConnection();
            }
            return instanta;
        }

        @Override
        public void conectareUtilizator(String numeUtilizator) {
            if (!canaleUtilizatori.containsKey(numeUtilizator)) {
                String canalNou = "Canal-" + UUID.randomUUID().toString().substring(0, 5);
                canaleUtilizatori.put(numeUtilizator, canalNou);
                System.out.println("Utilizatorul " + numeUtilizator + " a primit " + canalNou);
            }
        }

        @Override
        public String getCanal(String numeUtilizator) {
            return canaleUtilizatori.get(numeUtilizator);
        }
}
