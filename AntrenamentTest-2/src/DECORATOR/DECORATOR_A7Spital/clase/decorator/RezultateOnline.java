package DECORATOR.DECORATOR_A7Spital.clase.decorator;

import DECORATOR.DECORATOR_A7Spital.clase.RezultateAbstract;

public class RezultateOnline extends RezultateDecorator{
    public RezultateOnline(RezultateAbstract rezultateAbstract) {
        super(rezultateAbstract);
    }

    @Override
    public void afisareOnline(){
        System.out.println("Rezultatele analizelor au fost afisate si online");
    }
}
