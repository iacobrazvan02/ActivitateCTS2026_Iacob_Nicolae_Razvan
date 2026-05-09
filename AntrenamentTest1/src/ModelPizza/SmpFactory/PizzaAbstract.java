package ModelPizza.SmpFactory;

public abstract class PizzaAbstract implements IPizza{
    private String nume;
    private double pret;

    public PizzaAbstract(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
        public String getNume() {
            return this.nume;
        }

        @Override
        public double getPret() {
            return this.pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PizzaAbstract{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
