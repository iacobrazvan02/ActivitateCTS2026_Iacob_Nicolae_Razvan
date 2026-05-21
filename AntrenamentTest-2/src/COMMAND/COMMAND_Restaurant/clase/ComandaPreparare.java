package COMMAND.COMMAND_Restaurant.clase;

public class ComandaPreparare implements ComandaRestaurant {
    private Bucatar bucatar;
    private String numePreparat;

    public ComandaPreparare(Bucatar bucatar, String numePreparat) {
        this.bucatar = bucatar;
        this.numePreparat = numePreparat;
    }

    @Override
    public void executa() {
        bucatar.preparaReteta(numePreparat);
    }
}