package STRATEGY.STRATEGY_F10Stb.clase;

public class CardBancar implements ModPlataCalatorie {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata contactless cu Cardul Bancar pentru suma: " + suma + " RON");
    }
}