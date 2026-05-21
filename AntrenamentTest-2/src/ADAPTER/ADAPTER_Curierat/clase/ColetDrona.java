package ADAPTER.ADAPTER_Curierat.clase;

public class ColetDrona {
    private String clientDrona;
    private String coordonateGPS;
    private double masaKg;

    public ColetDrona(String coordonateGPS, String clientDrona, double masaKg) {
        this.coordonateGPS = coordonateGPS;
        this.clientDrona = clientDrona;
        this.masaKgPachet = masaKg;
    }

    public String getClientDrona() {
        return clientDrona;
    }

    public String getCoordonateGPS() {
        return coordonateGPS;
    }

    public double getMasaKg() {
        return masaKg;
    }
}

