package COMPOSITE.COMPOSITE_F6Stb.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuz implements NodFlota{

    private String denumireGrup;
    private List<NodFlota> lista;

    public GrupAutobuz(String denumireGrup) {
        this.denumireGrup = denumireGrup;
        this.lista = new ArrayList<>();
    }

    public void adaugaNodFlota(NodFlota nodFlota) {
        this.lista.add(nodFlota);
    }

    public void stergeNodFlota(NodFlota nodFlota){
        this.lista.remove(nodFlota);
    }

    @Override
    public void afiseazaDetaliiGarantie() {
        System.out.println("Garantie pentru grupul cu denumire" + this.denumireGrup);
        for(NodFlota nodFlota : lista){
            nodFlota.afiseazaDetaliiGarantie();
        }
    }

}
