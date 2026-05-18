package FACADE.FACADE_H1Hotel.main;

import FACADE.FACADE_H1Hotel.clase.*;
import FACADE.FACADE_H1Hotel.clase.*;

public class Main {
    public static void main(String[] args){
        Client client = new Client("Marian");
        Client client2 = new Client("Adrian");
        Client client4 = new Client("Marcelica");

        ServiciuCuratenie serviciuCuratenie = new ServiciuCuratenie();
        SistemClimatizare sistemClimatizare = new SistemClimatizare();
        SistemSecuritate sistemSecuritate = new SistemSecuritate();

        FacadeCazare facadeCazare = new FacadeCazare(serviciuCuratenie, sistemSecuritate, sistemClimatizare);
        facadeCazare.cazeazaClient(client);
    }
}
