package ro.ase.cts.clase;

public class Spital {
    private Medic medic;
    private Salon salon;

    public Spital(Salon salon, Medic medic) {
        this.salon = salon;
        this.medic = medic;
    }

    public void internarePacient(Pacient pacient) {
        if(pacient.getGravitate() > 4) {
            if(medic.areInregistratPacientul(pacient)) {
                int nrPat = salon.getPatLiber();
                if(nrPat != -1) {
                    System.out.println("Pacientul cu numele " + pacient.getNume() + " va fi internat in patul cu numarul " + nrPat);
                    salon.ocupaPat(nrPat);
                } else {
                    System.out.println("Nu mai avem paturi libere");
                }
            } else {
                System.out.println("Trebuie trimitere de la medic");
            }
        } else {
            System.out.println("Gravitatea pacientului nu este destul de mare");
        }
    }
}