package STRATEGY.STRATEGY_F10Stb.clase;

public class PlataSMS implements ModPlataCalatorie {
    @Override
    public void plateste(double suma) {
        System.out.println("S-a trimis SMS de plata pentru suma: " + suma + " RON");
    }
}