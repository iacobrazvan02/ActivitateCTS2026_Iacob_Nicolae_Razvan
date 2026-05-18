package PROXY.PROXY_A9Spital.clase;

public class Pacient implements IPacient{
    private String nume;
    private boolean asigurare;

    public Pacient(String nume, boolean asigurare) {
        this.nume = nume;
        this.asigurare = asigurare;
    }

    @Override
    public void interneazaPacient() {
        System.out.println("Pacientul " + this.getNume() + " a fost internat cu succes in spital" );
    }

    @Override
    public boolean areAsigurare() {
        return asigurare;
    }

    @Override
    public String getNume() {
        return nume;
    }
}
