package ModelLicentaTurism.builder;

public class HolidayPackageBuilder1 implements AbstractHolidayPackage1 {
    private boolean hasTransport;
    private boolean hasCazare;
    private boolean hasActivitati;

    public HolidayPackageBuilder1(){
        this.hasTransport = false;
        this.hasCazare = false;
        this.hasActivitati = false;
    }

    @Override
    public HolidayPackage1 build() {
        return new HolidayPackage1(hasTransport, hasCazare, hasActivitati);
    }

    @Override
    public AbstractHolidayPackage1 setTransport(boolean hasTransport) {
        this.hasTransport = hasTransport;
        return this;
    }

    @Override
    public AbstractHolidayPackage1 setCazare(boolean hasCazare) {
        this.hasCazare = hasCazare;
        return this;
    }

    @Override
    public AbstractHolidayPackage1 setActivitati(boolean hasActivitati) {
        this.hasActivitati = hasActivitati;
        return this;
    }
}
