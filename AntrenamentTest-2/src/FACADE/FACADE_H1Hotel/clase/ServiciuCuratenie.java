package FACADE.FACADE_H1Hotel.clase;

public class ServiciuCuratenie {

    private boolean[] camereCurate = new boolean[10];

    public ServiciuCuratenie() {
        camereCurate[1] = true;
        camereCurate[2] = true;
        camereCurate[5] = true;
        camereCurate[8] = true;
    }

    public int getCameraCurata() {
        for (int i = 0; i < camereCurate.length; i++) {
            if (camereCurate[i]) {
                return i;
            }
        }
        return -1;
    }

    public void ocupaCamera(int nrCamera){
        this.camereCurate[nrCamera] = false;
    }


}
