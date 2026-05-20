package STRATEGY.STRATEGY_F10Stb.main;

import STRATEGY.STRATEGY_F10Stb.clase.Calator;
import STRATEGY.STRATEGY_F10Stb.clase.CardBancar;
import STRATEGY.STRATEGY_F10Stb.clase.CardCalatorii;
import STRATEGY.STRATEGY_F10Stb.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator1 = new Calator("Gigel");
        calator1.platesteBilet(20);

        calator1.setModPlata(new CardCalatorii());
        calator1.platesteBilet(10);

        calator1.setModPlata(new PlataSMS());
        calator1.platesteBilet(3.0);

        calator1.setModPlata(new CardBancar());
        calator1.platesteBilet(3.0);
    }
}