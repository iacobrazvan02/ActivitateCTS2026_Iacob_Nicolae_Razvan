package ModelPlatformaStreamingFilme.Singleton;

public class Membership implements AbstractMembership{
    private String type;
    private double pret;

    private static Membership instanta=null;

    private Membership(){
        this.type="Premium";
        this.pret=20.0;
    }

    public Membership(String type, double pret) {
        this.type = type;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetaliiAbonament() {
        System.out.println("Abonament "+this.type+" "+this.pret);
    }

    @Override
    public double getPretLunar() {
        return pret;
    }

    public static synchronized Membership getInstance(String type, double pret){
        if(instanta==null){
            instanta=new Membership(type,pret);
        }
        return instanta;
    }
}