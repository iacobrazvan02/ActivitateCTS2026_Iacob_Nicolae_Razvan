package DECORATOR.DECORATOR_A7Spital.clase;

public class Rezultate implements RezultateAbstract{
    private String data;
    private String asistente;

    public Rezultate(String data, String asistente) {
        this.data = data;
        this.asistente = asistente;
    }

    @Override
    public void printeaza() {
        System.out.println("Au fost date rezultatele pacientilor in data de " + this.data + " de catre " + this.asistente);
    }
}
