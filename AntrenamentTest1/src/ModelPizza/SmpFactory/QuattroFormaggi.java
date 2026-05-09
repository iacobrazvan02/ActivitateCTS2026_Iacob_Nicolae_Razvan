package ModelPizza.SmpFactory;

public class QuattroFormaggi extends PizzaAbstract{
    public QuattroFormaggi(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void pizzaDetalii() {
        System.out.println("Pizza QuatroFormaggi:" + super.toString());
    }
}
