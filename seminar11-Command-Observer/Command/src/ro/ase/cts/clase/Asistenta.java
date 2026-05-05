package ro.ase.cts.clase;

public class Asistenta implements PersonalSpital{

    private String numeA;

    public Asistenta(String numeA) {
        this.numeA = numeA;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta" + numeA + "trateaza imediat pacientul" + pacient.getName());
    }
}
