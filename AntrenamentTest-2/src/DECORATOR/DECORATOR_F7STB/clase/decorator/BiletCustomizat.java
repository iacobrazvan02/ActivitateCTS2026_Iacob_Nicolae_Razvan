package DECORATOR.DECORATOR_F7STB.clase.decorator;

import DECORATOR.DECORATOR_F7STB.clase.BiletAbstract;

public class BiletCustomizat extends BiletDecorator {
    private String mesajSarbatoare;

    public BiletCustomizat(BiletAbstract biletAbstract, String mesajSarbatoare) {
        super(biletAbstract);
        this.mesajSarbatoare = mesajSarbatoare;
    }

    @Override
    public void printeazaMesajPersonalizat() {
        System.out.println("La multi ani " + mesajSarbatoare + " din partea STB!");
    }
}