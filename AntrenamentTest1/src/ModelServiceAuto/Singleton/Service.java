package ModelServiceAuto.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Service implements IService{
    private List<AMasina> listaMasini;

    private Service(){
        this.listaMasini = new ArrayList<>();
    }

    private static Service instanta = null;

    public void afiseazaMasini(){
        listaMasini.forEach(System.out::println);
    }

    @Override
    public void preiaMasina(AMasina masina) {
        listaMasini.add(masina);

    }

    @Override
    public void finalizeazaReparatie() {
        listaMasini.clear();

    }

    public static synchronized Service getInstance(){
        if(instanta == null){
            instanta = new Service();
        }
        return instanta;
    }
}
