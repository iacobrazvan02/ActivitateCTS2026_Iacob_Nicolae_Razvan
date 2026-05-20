package OBSERVER.OBSERVER_STB.clase;

public class CalatorAbonat implements Calator {
    private String nume;
    private String rutaPreferata;

    public CalatorAbonat(String nume, String rutaPreferata) {
        this.nume = nume;
        this.rutaPreferata = rutaPreferata;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Calatorul " + this.nume + " ruta " + this.rutaPreferata + " a primit mesajul: " + mesaj);
    }
}