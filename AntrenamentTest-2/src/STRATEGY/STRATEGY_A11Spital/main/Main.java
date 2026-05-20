package STRATEGY.STRATEGY_A11Spital.main;


import STRATEGY.STRATEGY_A11Spital.clase.Pacient;
import STRATEGY.STRATEGY_A11Spital.clase.PlataCard;
import STRATEGY.STRATEGY_A11Spital.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Marian");
        pacient1.efectueazaPlata(500);

        pacient1.setModPlata(new PlataCash());
        pacient1.efectueazaPlata(200);

        pacient1.setModPlata(new PlataCard());
        pacient1.efectueazaPlata(300.0);
    }
}