package STRATEGY.STRATEGY_A11Spital.clase;

public class PlataCard implements ModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Ai platit cu CARDUL suma de: " + suma + " RON");
    }
}