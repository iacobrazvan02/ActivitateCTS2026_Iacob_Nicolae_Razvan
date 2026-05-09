package ModelPizza.SmpFactory;

public class Diavola extends PizzaAbstract{

    public Diavola(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void pizzaDetalii() {
        System.out.println("Pizza Diavola:" + super.toString());
    }
}
