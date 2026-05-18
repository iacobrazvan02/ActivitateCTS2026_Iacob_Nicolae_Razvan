package DECORATOR.DECORATOR_A7Spital.main;

import DECORATOR.DECORATOR_A7Spital.clase.Rezultate;
import DECORATOR.DECORATOR_A7Spital.clase.decorator.RezultateDecorator;
import DECORATOR.DECORATOR_A7Spital.clase.decorator.RezultateOnline;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Rezultate rezultate = new Rezultate("01.04.2026", "Marinela");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alegeti metoda de emitere a rezultatelor:");
        System.out.println("1 - Doar format fizic (Sistemul online e picat)");
        System.out.println("2 - Format fizic + Afisare pe platforma online");
        System.out.print("Optiunea dvs: ");

        int optiune = scanner.nextInt();

        if (optiune == 1) {
            System.out.println("\nEmitere Clasica ");
            rezultate.printeaza();
        } else if (optiune == 2) {
            System.out.println("\nEmitere cu Decorator");
            RezultateDecorator rezultateDecorate = new RezultateOnline(rezultate);

            rezultateDecorate.printeaza();
            rezultateDecorate.afisareOnline();
        } else {
            System.out.println("Optiune invalida!");
        }

        scanner.close();
    }
}