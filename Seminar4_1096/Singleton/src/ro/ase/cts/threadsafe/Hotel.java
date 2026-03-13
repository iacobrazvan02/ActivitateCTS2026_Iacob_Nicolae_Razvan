package ro.ase.cts.threadsafe;

public class Hotel {
    private String denumire;
    private int numarCamere;
    private int numarCamereInchiriate;
    private int numarAngajati;

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNumarCamere(int numarCamere) {
        this.numarCamere = numarCamere;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public void afisareInchiriere(){
        if(numarCamereInchiriate<numarCamere){
            numarCamereInchiriate++;
            System.out.println("Hotelul a inchiriat o camera.");
        }
        else{
            System.out.println("Hotelul are toate camerele ocupate.");
        }
    }

    public void afisareDescriere(){
        StringBuilder sb= new StringBuilder();
        sb.append("Hotelul ").append(denumire);
        sb.append(" are ").append(numarCamere);
        sb.append(" camere, dintre care ").append(numarCamereInchiriate).append(" sunt inchiriate, si ");
        sb.append(numarAngajati).append(" angajati.");
        System.out.println(sb);
    }

    private Hotel(String denumire, int numarCamere, int numarAngajati) {
        this.denumire = denumire;
        this.numarCamere = numarCamere;
        this.numarAngajati = numarAngajati;
        this.numarCamereInchiriate = 0;
    }

    private static Hotel instanta = null;

    public static synchronized Hotel getInstance(String denumire, int numarCamere, int numarAngajati){
        if(instanta==null){
            instanta=new Hotel(denumire,numarCamere,numarAngajati);
        }

        return instanta;
    }
}