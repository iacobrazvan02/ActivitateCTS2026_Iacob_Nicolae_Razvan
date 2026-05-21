package ADAPTER.ADAPTER_Curierat.clase;

public class ColetDronaAdapter implements AbstractColet{
    private ColetDrona coletDrona;

    public ColetDronaAdapter(ColetDrona coletDrona) {
        this.coletDrona = coletDrona;
    }

    @Override
    public String obtineNumeDestinatar() {
        return coletDrona.getClientDrona();
    }

    @Override
    public String obtineAdresaLivrare() {
        return coletDrona.getCoordonateGPS();
    }

    @Override
    public double obtineGreutatePachet() {
        return coletDrona.getMasaKg();
    }
}
