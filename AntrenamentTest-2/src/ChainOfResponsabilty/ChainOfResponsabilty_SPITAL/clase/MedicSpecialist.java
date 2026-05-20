package ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.clase;

public class MedicSpecialist extends HandlerPacient {
    @Override
    public String trateazaPacient(int gradGravitate) {
        return "Pacient tratat URGENT de Medic Specialist";
    }
}