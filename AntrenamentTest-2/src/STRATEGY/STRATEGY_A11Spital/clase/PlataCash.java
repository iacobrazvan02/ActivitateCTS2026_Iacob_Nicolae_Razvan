package STRATEGY.STRATEGY_A11Spital.clase;

public class PlataCash implements ModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Ai platit CASH suma de: " + suma + " RON");
    }
}