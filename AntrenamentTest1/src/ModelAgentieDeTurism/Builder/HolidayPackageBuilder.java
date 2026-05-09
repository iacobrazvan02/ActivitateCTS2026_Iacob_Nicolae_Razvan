package ModelAgentieDeTurism.Builder;

public class HolidayPackageBuilder implements Builder{

    private boolean transport;
    private int durata;
    private String tipCamera;
    private int steleHotel;
    private boolean excursiiDeGrup;
    private boolean viziteMuzee;

    @Override
    public HolidayPackage build() {
        return new HolidayPackage(transport, durata,tipCamera,steleHotel,excursiiDeGrup,viziteMuzee);
    }

    public HolidayPackageBuilder setTransport(boolean transport) {
        this.transport = transport;
        return this;
    }

    public HolidayPackageBuilder setDurata(int durata) {
        this.durata = durata;
        return this;
    }

    public HolidayPackageBuilder setTipCamera(String tipCamera) {
        this.tipCamera = tipCamera;
        return this;
    }

    public HolidayPackageBuilder setSteleHotel(int steleHotel) {
        this.steleHotel = steleHotel;
        return this;
    }

    public HolidayPackageBuilder setExcursiiDeGrup(boolean excursiiDeGrup) {
        this.excursiiDeGrup = excursiiDeGrup;
        return this;
    }

    public HolidayPackageBuilder setViziteMuzee(boolean viziteMuzee) {
        this.viziteMuzee = viziteMuzee;
        return this;
    }
}
