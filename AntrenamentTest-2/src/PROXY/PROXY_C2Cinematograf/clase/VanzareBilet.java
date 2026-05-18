package PROXY.PROXY_C2Cinematograf.clase;

public class VanzareBilet implements IVanzareBilet{
    private int varstaClient;
    private String numeClient;

    public VanzareBilet(int varstaClient, String numeClient) {
        this.varstaClient = varstaClient;
        this.numeClient = numeClient;
    }

    @Override
    public void vanzareBilet() {
        System.out.println("Biletul a fost vandut persoanei majore " + numeClient);
    }

    @Override
    public int getVarstaClient() {
        return varstaClient;
    }
}
