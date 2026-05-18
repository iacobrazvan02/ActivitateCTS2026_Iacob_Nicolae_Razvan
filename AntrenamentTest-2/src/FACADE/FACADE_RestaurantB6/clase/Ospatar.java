package FACADE.FACADE_RestaurantB6.clase;

public class Ospatar {
    private boolean[] meseDebarasate = new boolean[10];
    private boolean[] meseCuServetele = new boolean[10];

    public Ospatar() {
        for (int i = 0; i < 10; i++) {
            meseDebarasate[i] = true;
            meseCuServetele[i] = true;
        }

        meseDebarasate[2] = false;
        meseCuServetele[4] = false;
    }
    public boolean suntMeseleDebarasate ( int nrMasa){
        return meseDebarasate[nrMasa];
    }

    public boolean suntPuseServetelePeMasa ( int nrMasa){
        return meseCuServetele[nrMasa];
    }
}
