package FACADE.FACADE_RestaurantB6.clase;

public class FacadeReceptie_Manager {
    private SistemMese mese;
    private Ospatar ospatar;

    public FacadeReceptie_Manager(SistemMese mese, Ospatar ospatar) {
        this.mese = mese;
        this.ospatar = ospatar;
    }

    public void verificaSiAseazaClient(Client client, int nrMasa){
        if (mese.getMasaLiber(nrMasa)){
            if(ospatar.suntMeseleDebarasate(nrMasa)){
                if(ospatar.suntPuseServetelePeMasa(nrMasa)){
                    System.out.println(" Clientul cu numele: " + client.getNume() + " va fi dus la masa" + nrMasa);
                    mese.ocupaMasa(nrMasa);
                }
                else{
                    System.out.println(" Mai trebuie puse servetele la masa " + nrMasa);
                }
            }
            else{
                System.out.println(" Masa " + nrMasa + " trebuie debarasata ");
            }
        }
        else{
            System.out.println(" Nu mai avem mese libere ");
        }
    }
}
