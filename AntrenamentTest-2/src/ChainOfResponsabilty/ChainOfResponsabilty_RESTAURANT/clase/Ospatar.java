package ChainOfResponsabilty.ChainOfResponsabilty_RESTAURANT.clase;

public class Ospatar extends HandlerNota {
    @Override
    public String aprobaReducere(double sumaNota) {
        if (sumaNota < 100) {
            return "Aprobare data de Ospatar";
        }
        return super.succesor.aprobaReducere(sumaNota);
    }
}