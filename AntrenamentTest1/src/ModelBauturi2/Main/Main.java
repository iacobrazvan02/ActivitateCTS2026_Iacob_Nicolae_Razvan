package ModelBauturi2.Main;

import ModelBauturi2.Model.*;

public class Main {
            public static void main(String[] args) {
                Bautura machiatto = BauturaFactory.creareBautura(TipBautura.Cafea,"MACHIATTO",300.0,32.5);
                Bautura milceai = BauturaFactory.creareBautura(TipBautura.Ceai,"milceai",400.0,20.5);
                Bautura milcioco = BauturaFactory.creareBautura(TipBautura.CiocolataCalda,"milcioco",250.0,15.5);

                System.out.println(machiatto);
                System.out.println(milceai);
                System.out.println(milcioco);

                machiatto.metodaDePreparare();
                milceai.metodaDePreparare();
                milcioco.metodaDePreparare();

                PrototypeBauturaPresetata bauturaPresetata = new BauturaPresetata("bile", 2020.0, 178.25);
                PrototypeBauturaPresetata bautura1 = bauturaPresetata.clone();
                ((BauturaPresetata)bautura1).setName("dog");

                System.out.println(bautura1);
                System.out.println(bauturaPresetata);

            }
        }
