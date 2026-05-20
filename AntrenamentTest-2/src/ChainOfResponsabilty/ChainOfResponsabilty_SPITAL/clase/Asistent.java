package ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.clase;

public class Asistent extends HandlerPacient {
    @Override
    public String trateazaPacient(int gradGravitate) {
        if (gradGravitate < 3) {
            return "Pacient tratat de Asistent";
        }
        return super.succesor.trateazaPacient(gradGravitate);
    }
}
