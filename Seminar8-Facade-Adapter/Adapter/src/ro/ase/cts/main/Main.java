package ro.ase.cts.main;

import ro.ase.cts.clase.spital.Medicament;
import ro.ase.cts.clase.spital.MedicamentAdapter;

public class Main {
    public static void main(String[] args) {
        Medicament medicamentSpital = new Medicament("Ibuprofen reteta", 15);
        ro.ase.cts.clase.farmacie.Medicament medicamentFarmacie = new ro.ase.cts.clase.farmacie.Medicament("Paracetamol");

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();
        procuraMedicament(medicamentFarmacie);

        MedicamentAdapter medicamentAdapter = new MedicamentAdapter(medicamentSpital);
        procuraMedicament(medicamentAdapter);
    }
    private static void procuraMedicament(ro.ase.cts.clase.farmacie.Medicament medicament) {
        medicament.cumparaMedicament();
    }
}