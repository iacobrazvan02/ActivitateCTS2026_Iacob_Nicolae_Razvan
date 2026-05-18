package FACADE.FACADE_STBF5.clase;

public class PanouFacade {
    private Usa usaInceput;
    private Usa usaMijloc;
    private Usa usaSpate;

    public PanouFacade(Usa usaInceput, Usa usaMijloc, Usa usaSpate) {
        this.usaInceput = usaInceput;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void deschideNormalToateUsile(Sofer sofer){
        System.out.println("Soferul " + sofer.getNume() + " a apasat pe butonul de ELIBERARE usi");
        usaInceput.deschideNormal();
        usaMijloc.deschideNormal();
        usaSpate.deschideNormal();
    }

    public void deschideFortatToateUsile(Sofer sofer){
        System.out.println("Soferul " + sofer.getNume() + " a deschis fortat toate usile");
        usaInceput.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
