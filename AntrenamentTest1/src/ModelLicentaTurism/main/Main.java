package ModelLicentaTurism.main;

import ModelLicentaTurism.builder.AbstractHolidayPackage1;
import ModelLicentaTurism.builder.HolidayPackage1;
import ModelLicentaTurism.builder.HolidayPackageBuilder1;

public class Main {
    public static void main(String[] args){
        AbstractHolidayPackage1 builder = new HolidayPackageBuilder1();
        HolidayPackage1 holidayPackage1 = builder.setActivitati(true).setTransport(true).build();
        System.out.println(holidayPackage1);

        HolidayPackage1 holidayPackage2 = builder.setCazare(true).build();
        HolidayPackage1 holidayPackage3 = builder.setActivitati(true).build();
        System.out.println(holidayPackage2);
        System.out.println(holidayPackage1);
    }
}
