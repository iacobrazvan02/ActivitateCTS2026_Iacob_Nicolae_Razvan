package ModelAgentieDeTurism.Main;

import ModelAgentieDeTurism.Builder.HolidayPackage;
import ModelAgentieDeTurism.Builder.HolidayPackageBuilder;
import ModelAgentieDeTurism.Singleton.AbstractTourismLicense;
import ModelAgentieDeTurism.Singleton.TourismLicense;

public class Main {
    private static AbstractTourismLicense tourismLicense2;
    public static void main(String[] args){
        AbstractTourismLicense tourismLicense1 = TourismLicense.getInstance();
        tourismLicense1.setLicenseNumber("Orice");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                tourismLicense2 = TourismLicense.getInstance();
            }
        });

        thread.start();
        try{
            thread.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        AbstractTourismLicense tourismLicense3 = TourismLicense.getInstance();

        System.out.println(tourismLicense3.getLicenseNumber());
        System.out.println(tourismLicense2.getLicenseNumber());

        HolidayPackageBuilder builder = new HolidayPackageBuilder();
        builder.setTransport(false);
        builder.setDurata(7);
        builder.setExcursiiDeGrup(true);
        builder.setSteleHotel(4);
        builder.setTipCamera("Premium");
        builder.setViziteMuzee(false);

        HolidayPackage pachet1 = builder.build();

        builder.setTipCamera("Platinum");
        HolidayPackage pachet2 = builder.build();

        builder.setTipCamera("Diamanant");
        HolidayPackage pachet3 = builder.build();

        System.out.println(pachet1.getDetaliiPachet());
        System.out.println(pachet2.getDetaliiPachet());
        System.out.println(pachet3.getDetaliiPachet());





    }
}
