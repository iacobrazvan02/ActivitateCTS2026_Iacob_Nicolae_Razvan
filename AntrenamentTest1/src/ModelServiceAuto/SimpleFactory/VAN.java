package ModelServiceAuto.SimpleFactory;

import ModelServiceAuto.Singleton.AMasina;

public class VAN extends AMasina {

    public VAN(String numarInmatriculare){
        super(numarInmatriculare);
    }
    @Override
    public void afiseazaDetaliiMasina() {
        System.out.println("VAN" + getNumarInmatriculare());
    }
}
