package DECORATOR.DECORATOR_F7STB.main;

import DECORATOR.DECORATOR_F7STB.clase.Bilet;
import DECORATOR.DECORATOR_F7STB.clase.BiletAbstract;
import DECORATOR.DECORATOR_F7STB.clase.decorator.BiletCustomizat;
import DECORATOR.DECORATOR_F7STB.clase.decorator.BiletDecorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zi normala");
        BiletAbstract biletNormal = new Bilet("336", 3.0);
        biletNormal.printeazaBilet();

        System.out.println("\nZi de Sarbatoare Nationala");
        BiletDecorator biletDecorat = new BiletCustomizat(biletNormal, "de Ziua Romaniei");

        biletDecorat.printeazaBilet();
        biletDecorat.printeazaMesajPersonalizat();
    }
}