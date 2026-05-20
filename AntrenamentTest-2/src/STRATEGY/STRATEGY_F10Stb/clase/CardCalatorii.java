package STRATEGY.STRATEGY_F10Stb.clase;

public class CardCalatorii implements ModPlataCalatorie {
    @Override
    public void plateste(double suma) {
        System.out.println("Validare cu Cardul de Calatorii pentru suma: " + suma + " RON");
    }
}
