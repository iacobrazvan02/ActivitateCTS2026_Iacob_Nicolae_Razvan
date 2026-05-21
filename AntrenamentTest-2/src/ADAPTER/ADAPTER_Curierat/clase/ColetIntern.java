package ADAPTER.ADAPTER_Curierat.clase;

public class ColetIntern implements AbstractColet{
    private String destinatar;
    private String adresa;
    private double greutate;

    public ColetIntern(String destinatar, String adresa, double greutate){
        this.destinatar = destinatar;
        this.adresa = adresa;
        this.greutate = greutate;
    }

    @Override
    public String obtineNumeDestinatar() {
        return destinatar;
    }

    @Override
    public String obtineAdresaLivrare() {
        return adresa;
    }

    @Override
    public double obtineGreutate() {
        return greutate;
    }
}
