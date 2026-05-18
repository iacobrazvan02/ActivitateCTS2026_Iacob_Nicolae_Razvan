package PROXY.PROXY_A9Spital.main;

import PROXY.PROXY_A9Spital.clase.IPacient;
import PROXY.PROXY_A9Spital.clase.Pacient;
import PROXY.PROXY_A9Spital.clase.ProxyAsigurare;

public class Main {
    public static void main(String[] args) {
        IPacient pacientValid = new Pacient("Andrei", true);
        IPacient pacientInvalid = new Pacient("Marcelica", false);

        IPacient proxyValid = new ProxyAsigurare(pacientValid);
        IPacient proxyInvalid = new ProxyAsigurare(pacientInvalid);


        proxyValid.interneazaPacient();
        System.out.println("");
        proxyInvalid.interneazaPacient();

    }
}