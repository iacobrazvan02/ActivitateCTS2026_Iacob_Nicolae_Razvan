package ChainOfResponsabilty.ChainOfResponsabilty_RESTAURANT.main;

import ChainOfResponsabilty.ChainOfResponsabilty_RESTAURANT.clase.HandlerNota;
import ChainOfResponsabilty.ChainOfResponsabilty_RESTAURANT.clase.Manager;
import ChainOfResponsabilty.ChainOfResponsabilty_RESTAURANT.clase.Ospatar;
import ChainOfResponsabilty.ChainOfResponsabilty_RESTAURANT.clase.SefSala;

public class Main {
    public static void main(String[] args) {
        HandlerNota ospatar = new Ospatar();
        HandlerNota sefSala = new SefSala();
        HandlerNota manager = new Manager();

        ospatar.setSuccesor(sefSala);
        sefSala.setSuccesor(manager);

        System.out.println(ospatar.aprobaReducere(65.5));
        System.out.println(ospatar.aprobaReducere(250.0));
        System.out.println(ospatar.aprobaReducere(890.0));
    }
}