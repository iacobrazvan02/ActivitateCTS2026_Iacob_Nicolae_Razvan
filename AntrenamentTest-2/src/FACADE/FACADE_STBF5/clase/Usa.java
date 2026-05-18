package FACADE.FACADE_STBF5.clase;

public class Usa {
    private String pozitie;

    public Usa(String pozitie){
        this.pozitie = pozitie;
    }
    public void deschideNormal(){
        System.out.println(" Usa din " + pozitie + " este acum pe liber(poate fi deschisa de pasageri)");
    }

    public void deschideFortat(){
        System.out.println("Usa " + pozitie + " a fost deschisa fortat de sofer");
    }
}
