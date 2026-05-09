package ModelAgentieDeTurism.Builder;

public class HolidayPackage implements AbstractHolidayPackage {

    private boolean transport;
    private int durata;
    private String tipCamera;
    private int steleHotel;
    private boolean excursiiDeGrup;
    private boolean viziteMuzee;

    public HolidayPackage(boolean transport, int durata, String tipCamera, int steleHotel, boolean excursiiDeGrup, boolean viziteMuzee) {
        this.transport = transport;
        this.durata = durata;
        this.tipCamera = tipCamera;
        this.steleHotel = steleHotel;
        this.excursiiDeGrup = excursiiDeGrup;
        this.viziteMuzee = viziteMuzee;
    }

    @Override
    public String getDetaliiPachet() {
        return this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolidayPackage{");
        sb.append("transport=").append(transport);
        sb.append(", durata=").append(durata);
        sb.append(", tipCamera='").append(tipCamera).append('\'');
        sb.append(", steleHotel=").append(steleHotel);
        sb.append(", excursiiDeGrup=").append(excursiiDeGrup);
        sb.append(", viziteMuzee=").append(viziteMuzee);
        sb.append('}');
        return sb.toString();
    }
}
