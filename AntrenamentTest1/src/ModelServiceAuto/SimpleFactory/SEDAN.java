package ModelServiceAuto.SimpleFactory;

import ModelServiceAuto.Singleton.AMasina;

public class SEDAN extends AMasina {
    public SEDAN(String numarInmatriculare){
        super(numarInmatriculare);
    }
    @Override
    public void afiseazaDetaliiMasina() {
        System.out.println("SEDAN:" + getNumarInmatriculare());

    }
}
