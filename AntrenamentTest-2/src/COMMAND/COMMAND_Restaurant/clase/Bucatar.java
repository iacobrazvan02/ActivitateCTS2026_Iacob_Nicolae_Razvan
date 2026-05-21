package COMMAND.COMMAND_Restaurant.clase;

public class Bucatar {
    private String nume;

    public Bucatar(String nume) {
        this.nume = nume;
    }

    public void preparaReteta(String numePreparat) {
        System.out.println("Bucatarul " + this.nume + " prepara " + numePreparat);
    }
}

