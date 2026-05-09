package ModelBauturi2.Model;

public class BauturaPresetata implements PrototypeBauturaPresetata{
    private String name;
    private double volum;
    private double pret;

    private BauturaPresetata(){
    }

    public BauturaPresetata(String name, double volum, double pret) {
        this.name = name;
        this.volum = volum;
        this.pret = pret;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolum(double volum) {
        this.volum = volum;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public PrototypeBauturaPresetata clone() {
        BauturaPresetata bauturaPresetata = new BauturaPresetata();
        bauturaPresetata.name = this.name;
        bauturaPresetata.volum = this.volum;
        bauturaPresetata.pret = this.pret;
        return bauturaPresetata;
    }

}
