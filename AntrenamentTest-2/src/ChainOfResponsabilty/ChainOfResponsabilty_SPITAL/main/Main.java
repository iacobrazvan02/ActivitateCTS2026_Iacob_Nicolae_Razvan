package ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.main;

import ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.clase.Asistent;
import ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.clase.HandlerPacient;
import ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.clase.MedicGarda;
import ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.clase.MedicSpecialist;

public class Main {
    public static void main(String[] args) {
        HandlerPacient asistent = new Asistent();
        HandlerPacient medicGarda = new MedicGarda();
        HandlerPacient medicSpecialist = new MedicSpecialist();

        asistent.setSuccesor(medicGarda);
        medicGarda.setSuccesor(medicSpecialist);

        System.out.println(asistent.trateazaPacient(2));
        System.out.println(asistent.trateazaPacient(5));
        System.out.println(asistent.trateazaPacient(9));
    }
}