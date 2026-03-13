package ro.ase.cts.main;

import ro.ase.cts.threadsafe.Hotel;

public class Program {
    public static void main(String[] args){
        Hotel hotel1=Hotel.getInstance("Hotel1",2,4);
        Hotel hotel2=Hotel.getInstance("Hotel2",6,20);

        hotel1.afisareInchiriere();
        hotel1.afisareInchiriere();

        hotel2.afisareInchiriere();
        hotel2.afisareInchiriere();
    }
}