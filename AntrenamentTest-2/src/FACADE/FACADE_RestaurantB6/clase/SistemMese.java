package FACADE.FACADE_RestaurantB6.clase;

public class SistemMese {
    private boolean[] meseLibere = new boolean[10];

    public SistemMese() {
        for (int i = 0; i < meseLibere.length; i++) {
            meseLibere[i] = true;
        }
    }

    public boolean getMasaLiber(int nrMasa){
        return meseLibere[nrMasa];
    }

    public void ocupaMasa(int nrMasa){
        this.meseLibere[nrMasa] = false;
    }
}
