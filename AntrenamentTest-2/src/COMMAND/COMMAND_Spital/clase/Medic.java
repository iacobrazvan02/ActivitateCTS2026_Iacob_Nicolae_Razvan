package COMMAND.COMMAND_Spital.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void trateazaPacient(String numePacient) {
        System.out.println("Medicul " + this.nume + " trateaza pacientul " + numePacient);
    }
}