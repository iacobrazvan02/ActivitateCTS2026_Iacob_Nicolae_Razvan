package PROXY.PROXY_H2Hotel.clase;

public class RezervareLux implements IRezervareHotel {
    private boolean statutMembruVip;

    public RezervareLux(boolean statutMembruVip) {
        this.statutMembruVip = statutMembruVip;
    }

    @Override
    public void rezervaApartament() {
        System.out.println("Rezervarea a fost realizata cu succes de clientul care are vip " + isVip());
    }

    @Override
    public boolean isVip() {
        return statutMembruVip;
    }
}
