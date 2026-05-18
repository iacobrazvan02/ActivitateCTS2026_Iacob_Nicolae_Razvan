package DECORATOR.DECORATOR_A7Spital.clase.decorator;

import DECORATOR.DECORATOR_A7Spital.clase.RezultateAbstract;

public abstract class RezultateDecorator implements RezultateAbstract {
private RezultateAbstract rezultateAbstract;

    public RezultateDecorator(RezultateAbstract rezultateAbstract) {
        this.rezultateAbstract = rezultateAbstract;
    }

    @Override
    public void printeaza() {
        rezultateAbstract.printeaza();
    }

    public abstract void afisareOnline();
}
