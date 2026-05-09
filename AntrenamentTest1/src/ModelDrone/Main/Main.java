package ModelDrone.Main;

import ModelDrone.Prototype.AutonomousDriving;
import ModelDrone.Prototype.ModulAi;
import ModelDrone.Singleton.DroneConnection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //prototype

// 1. Definim 3 versiuni diferite de module AI (Prototipurile)
        ModulAi v1 = new ModulAi("v1.0", Arrays.asList("Stop la obstacol", "Zbor liniar"));
        ModulAi v2 = new ModulAi("v2.0", Arrays.asList("Ocolire obstacol", "Zbor zigzag"));
        ModulAi v3 = new ModulAi("v3.0", Arrays.asList("Urmarire tinta", "Aterizare automata"));

        // 2. Cream rapid 5 obiecte prin clonare (fara sa mai trecem prin logica grea de new)
        AutonomousDriving d1 = v1.cloneaza();
        AutonomousDriving d2 = v1.cloneaza(); // A doua copie de v1
        AutonomousDriving d3 = v2.cloneaza();
        AutonomousDriving d4 = v2.cloneaza(); // A doua copie de v2
        AutonomousDriving d5 = v3.cloneaza();

        // 3. Demonstram utilizarea regulilor intr-un context (Printam rezultatele)
        System.out.println("--- Drone activate ---");
        System.out.println("Drona 1 (din v1): " + d1);
        System.out.println("Drona 2 (din v1): " + d2);
        System.out.println("Drona 3 (din v2): " + d3);
        System.out.println("Drona 4 (din v2): " + d4);
        System.out.println("Drona 5 (din v3): " + d5);

        // Verificam Deep Copy (Daca d1 schimba regulile, d2 ramane intact)
        d1.getDecisionRules().add("Mod de noapte");
        System.out.println("\nVerificare Deep Copy:");
        System.out.println("Drona 1 reguli noi: " + d1.getDecisionRules());
        System.out.println("Drona 2 reguli ramase: " + d2.getDecisionRules());



        //singleton


        DroneConnection conexiune1 = DroneConnection.getInstanta();
        DroneConnection conexiune2 = DroneConnection.getInstanta();

        // Demonstrăm că este ACEEAȘI instanță (Singleton)
        if (conexiune1 == conexiune2) {
            System.out.println("DEMONSTRATIE: Toate operatiile sunt gestionate prin ACEEASI instanta.");
        }

        // Conectăm mai mulți utilizatori
        conexiune1.conectareUtilizator("Andrei");
        conexiune2.conectareUtilizator("Maria"); // Folosim a doua referință, dar e același obiect
        conexiune1.conectareUtilizator("Andrei"); // Nu ar trebui să aloce canal nou

        // Verificăm alocarea canalelor unice
        System.out.println("Canal Andrei: " + conexiune1.getCanal("Andrei"));
        System.out.println("Canal Maria: " + conexiune1.getCanal("Maria"));
    }
}
