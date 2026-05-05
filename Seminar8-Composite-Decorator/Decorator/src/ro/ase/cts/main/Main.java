package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.decorator.NotaDePlata1Mai;
import ro.ase.cts.clase.decorator.NotaDePlataDecorator;
import ro.ase.cts.clase.decorator.NotaDePlataNouAn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(225.3f, "01.05.2026");
        notaDePlata.printeaza();

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        NotaDePlataDecorator notaDePlataDecorator;
        if(a == 2) {
            notaDePlataDecorator = new NotaDePlataNouAn(notaDePlata);
        } else {
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }
        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();

    }
}