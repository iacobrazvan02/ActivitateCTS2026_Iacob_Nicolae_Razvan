package FLYWEIGHT.FLYWEIGHT_HOTEL.clase;

public class Camera implements ICamera{

    private String denumire;
    private int nrPaturi;
    private double pretBaza;
    private boolean areBalcon;

    protected Camera(String denumire, double pretBaza, int nrPaturi, boolean areBalcon) {
        this.denumire = denumire;
        this.pretBaza = pretBaza;
        this.nrPaturi = nrPaturi;
        this.areBalcon = areBalcon;
    }

    @Override
    public void afiseazaDetaliiCazare(Cazare cazare) {
        System.out.println("Camera " + this.denumire + "cu paturi: " + this.nrPaturi +" a fost data la pretul"
                +this.pretBaza + " " +  this.areBalcon );
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrPaturi=").append(nrPaturi);
        sb.append(", pretBaza=").append(pretBaza);
        sb.append(", areBalcon=").append(areBalcon);
        sb.append('}');
        return sb.toString();
    }
}
