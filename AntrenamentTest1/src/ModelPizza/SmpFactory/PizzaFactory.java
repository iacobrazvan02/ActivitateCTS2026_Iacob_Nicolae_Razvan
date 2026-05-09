package ModelPizza.SmpFactory;

import java.sql.SQLOutput;

import static ModelPizza.SmpFactory.PizzaEnum.*;

public class PizzaFactory {
    public static PizzaAbstract crearePizza(PizzaEnum type, String nume, double pret){
        if(type == CAPRICCIOSA){
            return new Capricciosa(nume, pret);
        }
        if(type == DIAVOLA) {
            return new Diavola(nume, pret);
        }
        if(type == MARGHERITA) {
            return new Margherita(nume, pret);
        }
        if(type == QUATROFORMAGGI) {
            return new QuattroFormaggi(nume, pret);
        }
        System.out.println("Tip invalid");
        return null;
    }
}
