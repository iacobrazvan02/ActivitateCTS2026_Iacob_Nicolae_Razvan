package FLYWEIGHT.FLYWEIGHT_HOTEL.clase;

public class Cazare {
    private String numeTurist;
    private int nrNopti;
    private String dataCheckin;

    public Cazare(String numeTurist, int nrNopti, String dataCheckin) {
        this.numeTurist = numeTurist;
        this.nrNopti = nrNopti;
        this.dataCheckin = dataCheckin;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cazare{");
        sb.append("numeTurist='").append(numeTurist).append('\'');
        sb.append(", nrNopti=").append(nrNopti);
        sb.append(", dataCheckin='").append(dataCheckin).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
