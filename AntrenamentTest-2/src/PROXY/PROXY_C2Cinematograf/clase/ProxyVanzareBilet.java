package PROXY.PROXY_C2Cinematograf.clase;

public class ProxyVanzareBilet implements IVanzareBilet{
    private IVanzareBilet iVanzareBilet;

    public ProxyVanzareBilet(IVanzareBilet iVanzareBilet) {
        this.iVanzareBilet = iVanzareBilet;
    }

    @Override
    public void vanzareBilet() {
        if(iVanzareBilet.getVarstaClient() >= 18){
            iVanzareBilet.vanzareBilet();
        }
        else{
            System.out.println("Biletul nu a putut fi vandut deoarece persoana nu are 18 ani");
        }
    }

    @Override
    public int getVarstaClient() {
        return iVanzareBilet.getVarstaClient();
    }
}
