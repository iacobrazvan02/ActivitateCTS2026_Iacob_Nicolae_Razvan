package COMMAND.COMMAND_Spital.clase;

public class ComandaTratament implements ComandaSpital {
    private Medic medic;
    private String numePacient;

    public ComandaTratament(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa() {
        medic.trateazaPacient(numePacient);
    }
}