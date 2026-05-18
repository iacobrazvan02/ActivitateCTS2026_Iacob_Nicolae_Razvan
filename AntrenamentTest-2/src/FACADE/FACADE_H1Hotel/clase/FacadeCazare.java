package FACADE.FACADE_H1Hotel.clase;

public class FacadeCazare {
    private ServiciuCuratenie serviciuCuratenie;
    private SistemClimatizare sistemClimatizare;
    private SistemSecuritate sistemSecuritate;

    public FacadeCazare(ServiciuCuratenie serviciuCuratenie, SistemSecuritate sistemSecuritate, SistemClimatizare sistemClimatizare) {
        this.serviciuCuratenie = serviciuCuratenie;
        this.sistemSecuritate = sistemSecuritate;
        this.sistemClimatizare = sistemClimatizare;
    }

    public void cazeazaClient(Client client){
        int nrCamera = serviciuCuratenie.getCameraCurata();
        if(nrCamera != -1){
            sistemSecuritate.activeazaCartela(nrCamera);
            sistemClimatizare.setTemperaturaOptima(nrCamera);
            serviciuCuratenie.ocupaCamera(nrCamera);

            System.out.println("Clientul " + client.getNume() + " a fost cazat cu succes in camera " + nrCamera );
        }
        else{
            System.out.println("Nu mai avem nicio camera disponibila");
        }
    }
}
