package ModelServiceAuto.SimpleFactory;

import ModelServiceAuto.Singleton.AMasina;

public class SUV extends AMasina {

    public SUV(String numarInmatriculare){
        super(numarInmatriculare);
    }
    @Override
    public void afiseazaDetaliiMasina() {
        System.out.println("SUV:" +getNumarInmatriculare());

    }
}
