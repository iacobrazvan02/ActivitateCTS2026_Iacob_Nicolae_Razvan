package ModelBauturi2.Model;

public class Cafea extends BauturaAbstracta{
    public Cafea(String name, double volum, double pret) {
        super(name, volum, pret);
    }

    @Override
    public void metodaDePreparare() {
        System.out.println("se baga boaba la aparat brrrrrrrrrrr");
    }
}

