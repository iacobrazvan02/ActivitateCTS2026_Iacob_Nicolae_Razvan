package FACADE.FACADE_C1Cinematograf.clase;

public class CinemaFacade {
    private SistemControlUsi sistemControlUsi;
    private SistemIluminat sistemIluminat;
    private SistemProiector sistemProiector;

    public CinemaFacade(SistemControlUsi sistemControlUsi, SistemIluminat sistemIluminat, SistemProiector sistemProiector) {
        this.sistemControlUsi = sistemControlUsi;
        this.sistemIluminat = sistemIluminat;
        this.sistemProiector = sistemProiector;
    }

    public void pregatireFilm(Angajat angajat, int nrSala){
        if(nrSala > 0){
            sistemIluminat.scadeLumina(nrSala);
            sistemControlUsi.inchidereUsi(nrSala);
            sistemProiector.incepeRulareReclameSiFilm(nrSala);
            System.out.println("Angajatul " + angajat.getNume() + " a terminat treaba si ruleaza filmul in sala " + nrSala );
        }
        else{
            System.out.println("Nu este posibila rularea filmului(sala invalida)");
        }
    }
}
