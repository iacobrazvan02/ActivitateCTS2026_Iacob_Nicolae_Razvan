package FLYWEIGHT.FLYWEIGHT_B10Restaurant.clase;

public class Client implements  ClientRestaurant{
    private String nume;
    private String nrTelefon;
    private String email;

    protected Client(String email, String nume, String nrTelefon) {
        this.email = email;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void afiseazaDetaliiRezervare(Rezervare rezervare) {
        System.out.println(rezervare);
        System.out.println("A fost facut de clientul " + this.nume + " " + this.nrTelefon + " " + this.email);
    }
}
