package FACADE.FACADE_C1Cinematograf.main;

import FACADE.FACADE_C1Cinematograf.clase.*;

public class Main {
    public static void main(String[] args){
        Angajat angajat = new Angajat("Matei");

        SistemControlUsi sistemControlUsi = new SistemControlUsi();
        SistemIluminat sistemIluminat = new SistemIluminat();
        SistemProiector sistemProiector = new SistemProiector();

        CinemaFacade cinemaFacade = new CinemaFacade(sistemControlUsi, sistemIluminat, sistemProiector);
        cinemaFacade.pregatireFilm(angajat, 3);
    }
}
