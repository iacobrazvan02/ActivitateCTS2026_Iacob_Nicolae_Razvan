package DECORATOR.DECORATOR_F7STB.clase.decorator;

import DECORATOR.DECORATOR_F7STB.clase.BiletAbstract;

public abstract class BiletDecorator implements BiletAbstract {
    private BiletAbstract biletAbstract;

    public BiletDecorator(BiletAbstract biletAbstract) {
        this.biletAbstract = biletAbstract;
    }

    @Override
    public void printeazaBilet() {
        biletAbstract.printeazaBilet(); // Executa actiunea biletului original
    }

    public abstract void printeazaMesajPersonalizat();
}