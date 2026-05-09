package ModelPizza.SmpFactory;

import org.w3c.dom.ls.LSOutput;

public class Capricciosa extends PizzaAbstract{

    public Capricciosa(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void pizzaDetalii() {
        System.out.println("Pizza Capricciosa:" + super.toString());
    }
}
