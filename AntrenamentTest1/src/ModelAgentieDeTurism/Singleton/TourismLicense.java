package ModelAgentieDeTurism.Singleton;

public class TourismLicense implements AbstractTourismLicense{
    private String licenseNumber;
    private static TourismLicense instanta = null;

    public static synchronized TourismLicense getInstance(){
        if(instanta == null){
            instanta = new TourismLicense();
        }
        System.out.println("hello");
        return instanta;
    }

    private TourismLicense() {
    }

    private TourismLicense(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void setLicenseNumber(String number) {
        if(this.licenseNumber == null) {
            this.licenseNumber = number;
        }
        else throw new RuntimeException("Nu merge");
        this.licenseNumber = number;
    }

    @Override
    public String getLicenseNumber() {
        return this.getLicenseNumber();
    }
}
