package PROXY.PROXY_B9Restaurant.clase;

public class ProxyRezervare implements IRezervare{
    private IRezervare iRezervare;

    public ProxyRezervare(IRezervare iRezervare) {
        this.iRezervare = iRezervare;
    }

    @Override
    public void rezervaMasa() {
        if(iRezervare.getNrPersoane() >= 4 ){
            iRezervare.rezervaMasa();
        }
        else{
            System.out.println(" Rezervarea nu a fost realizata ");
        }

    }

    @Override
    public int getNrPersoane() {
        return iRezervare.getNrPersoane();
    }
}
