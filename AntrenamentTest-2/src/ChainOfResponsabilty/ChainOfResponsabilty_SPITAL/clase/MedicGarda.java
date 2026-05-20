package ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.clase;

public class MedicGarda extends HandlerPacient {
    @Override
    public String trateazaPacient(int gradGravitate) {
        if (gradGravitate < 7) {
            return "Pacient tratat de Medic de Garda";
        }
        return super.succesor.trateazaPacient(gradGravitate);
    }
}