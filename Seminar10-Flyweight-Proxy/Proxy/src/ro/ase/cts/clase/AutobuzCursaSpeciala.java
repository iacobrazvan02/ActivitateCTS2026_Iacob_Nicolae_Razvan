package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie() {
        if(mijlocDeTransport.getLinie().toLowerCase().contains("speciala")) {
            System.out.println("Autobuzul are un traseu special");
        } else {
            mijlocDeTransport.opresteInStatie();
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocDeTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocDeTransport.getLinie();
    }
}