package ModelPizza.Main;

import ModelPizza.SmpFactory.IPizza;
import ModelPizza.SmpFactory.PizzaAbstract;
import ModelPizza.SmpFactory.PizzaEnum;
import ModelPizza.SmpFactory.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        IPizza p1 = PizzaFactory.crearePizza(PizzaEnum.MARGHERITA, "cu carciofi", 15);
        IPizza p2 = PizzaFactory.crearePizza(PizzaEnum.DIAVOLA, "cu peperoni", 25);
        p1.pizzaDetalii();
        p2.pizzaDetalii();

    }
}
