package OBSERVER.OBSERVER_Restaurant.clase;

public class ClientAbonat implements Client {
    private String nume;
    private String numarTelefon;

    public ClientAbonat(String nume, String numarTelefon) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Clientul " + this.nume + " cu nr de telefon " + this.numarTelefon + " a primit mesajul: " + mesaj);
    }
}