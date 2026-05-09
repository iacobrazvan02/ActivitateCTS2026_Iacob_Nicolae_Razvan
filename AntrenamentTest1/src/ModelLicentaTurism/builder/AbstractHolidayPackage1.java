package ModelLicentaTurism.builder;

public interface AbstractHolidayPackage1 {
    HolidayPackage1 build();
    AbstractHolidayPackage1 setTransport(boolean hasTransport);
    AbstractHolidayPackage1 setCazare(boolean hasCazare);
    AbstractHolidayPackage1 setActivitati(boolean hasActivitati);
}
