package ModelLicentaTurism.builder;

public class HolidayPackage1 {
    private final boolean hasTransport;
    private final boolean hasCazare;
    private final boolean hasActivitati;

    public HolidayPackage1(boolean hasTransport, boolean hasCazare, boolean hasActivitati) {
        this.hasTransport = hasTransport;
        this.hasCazare = hasCazare;
        this.hasActivitati = hasActivitati;
    }

    public boolean isHasTransport() {
        return hasTransport;
    }

    public boolean isHasCazare() {
        return hasCazare;
    }

    public boolean isHasActivitati() {
        return hasActivitati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolidayPackage{");
        sb.append("hasTransport=").append(hasTransport);
        sb.append(", hasCazare=").append(hasCazare);
        sb.append(", hasActivitati=").append(hasActivitati);
        sb.append('}');
        return sb.toString();
    }
}

