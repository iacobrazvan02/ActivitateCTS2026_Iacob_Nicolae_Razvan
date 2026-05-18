package PROXY.PROXY_H2Hotel.clase;

public class ProxyRezervare implements IRezervareHotel{
    private IRezervareHotel iRezervareHotel;

    public ProxyRezervare(IRezervareHotel iRezervareHotel) {
        this.iRezervareHotel = iRezervareHotel;
    }

    @Override
    public void rezervaApartament() {
        if(iRezervareHotel.isVip()){
            iRezervareHotel.rezervaApartament();
        }
        else{
            System.out.println("Rezervarea nu a avut loc");
        }
    }

    @Override
    public boolean isVip() {
        return iRezervareHotel.isVip();
    }
}
