package FLYWEIGHT.FLYWEIGHT_A10Spital.clase;

public class Pacient implements IPacientSpital{
    private String nume;
    private String nrTelefon;
    private String adresa;

    protected Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaDetaliiInternare(Internare internare) {
        System.out.println("A fost internat cu succes pacientul" + this.nume + " " + this.nrTelefon + " " + this.adresa);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
