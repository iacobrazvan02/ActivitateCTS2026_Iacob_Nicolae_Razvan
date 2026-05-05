package ro.ase.cts.clase.spital;

import ro.ase.cts.clase.farmacie.Medicament;

public class MedicamentAdapter extends Medicament {
    private ro.ase.cts.clase.spital.Medicament medicamentSpital;

    public MedicamentAdapter(ro.ase.cts.clase.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;
    }

    public MedicamentAdapter(String name) {
        super(name);
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}