package ChainOfResponsabilty.ChainOfResponsabilty_RESTAURANT.clase;

public class SefSala extends HandlerNota {
    @Override
    public String aprobaReducere(double sumaNota) {
        if (sumaNota < 500) {
            return "Aprobare data de Seful de Sala";
        }
        return super.succesor.aprobaReducere(sumaNota);
    }
}