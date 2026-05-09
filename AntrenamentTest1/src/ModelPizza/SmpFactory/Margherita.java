package ModelPizza.SmpFactory;

public class Margherita extends PizzaAbstract{

    public Margherita(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void pizzaDetalii() {
        System.out.println("Pizza Margherita:" + super.toString());
    }
}
