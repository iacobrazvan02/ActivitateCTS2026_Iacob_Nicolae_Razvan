package ro.ase.cts.clase;

public class Salon {
    private boolean[] paturiLibere = new boolean[10];

    public Salon() {
        paturiLibere[1] = true;
        paturiLibere[4] = true;
        paturiLibere[8] = true;
        paturiLibere[9] = true;
    }

    public int getPatLiber() {
        for(int i = 0; i < paturiLibere.length; i++) {
            if(paturiLibere[i]) {
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int nrPat) {
        this.paturiLibere[nrPat] = false;
    }
}