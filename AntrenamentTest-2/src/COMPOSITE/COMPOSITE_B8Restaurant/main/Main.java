package COMPOSITE.COMPOSITE_B8Restaurant.main;

import COMPOSITE.COMPOSITE_Agentie.clase.Item;
import COMPOSITE.COMPOSITE_B8Restaurant.clase.ItemProdus;
import COMPOSITE.COMPOSITE_B8Restaurant.clase.MeniuComponenta;
import COMPOSITE.COMPOSITE_B8Restaurant.clase.SectiuneMeniu;
import org.w3c.dom.html.HTMLTableSectionElement;

public class Main {
    public static void main(String[] args){
        MeniuComponenta startere = new SectiuneMeniu("Startere");
        MeniuComponenta bauturi = new SectiuneMeniu("bauturi");
        MeniuComponenta apaPlata = new ItemProdus("Apa", 12);
        MeniuComponenta bruschete = new ItemProdus("Bruschete", 30);

        ((SectiuneMeniu)startere).adaugaMeniuComponenta(bruschete);
        ((SectiuneMeniu)startere).adaugaMeniuComponenta(apaPlata);
        ((SectiuneMeniu)bauturi).adaugaMeniuComponenta(apaPlata);
        startere.afiseazaDetaliiMeniu();
        bauturi.afiseazaDetaliiMeniu();

        ((SectiuneMeniu)startere).stergeMeniuComponenta(bruschete);

    }
}
