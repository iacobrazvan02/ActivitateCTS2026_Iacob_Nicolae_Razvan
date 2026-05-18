package PROXY.PROXY_A9Spital.clase;

public class ProxyAsigurare implements IPacient{
    private IPacient pacient;

    public ProxyAsigurare(IPacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void interneazaPacient() {
        if(pacient.areAsigurare()){
            pacient.interneazaPacient();
        }
        else{
            System.out.println("Respins: Pacientul " + pacient.getNume() + " nu are asigurare");
        }
    }

    @Override
    public boolean areAsigurare() {
        return pacient.areAsigurare();
    }

    @Override
    public String getNume() {
        return pacient.getNume();
    }
}
