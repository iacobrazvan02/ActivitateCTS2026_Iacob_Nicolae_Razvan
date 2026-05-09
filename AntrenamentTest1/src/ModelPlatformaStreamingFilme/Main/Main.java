package ModelPlatformaStreamingFilme.Main;

import ModelPlatformaStreamingFilme.Builder.SearchingFilter;
import ModelPlatformaStreamingFilme.Builder.SearchingFilterBuilder;
import ModelPlatformaStreamingFilme.Singleton.AbstractMembership;
import ModelPlatformaStreamingFilme.Singleton.Membership;

public class Main {
    private static AbstractMembership membership1;

    public static void main(String[] args) {
        AbstractMembership membership=Membership.getInstance("Standard",10.0);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                membership1=Membership.getInstance("MUIE",12.294321321312);
                System.out.println("AM LUAT MUIe");
            }
        });

        thread.start();

        AbstractMembership membership2=Membership.getInstance("Platinum",30.55);

        membership.afiseazaDetaliiAbonament();
        membership1.afiseazaDetaliiAbonament();
        membership2.afiseazaDetaliiAbonament();

        SearchingFilterBuilder builder=new SearchingFilterBuilder();
        builder.setTitlu("Titlu1");
        builder.setAn(2004);
        builder.setActori("X Y");
        builder.setGen("Drama");
        builder.setRating(4.32);
        builder.setRecomandat(true);
        SearchingFilter filtru1=builder.build();
        builder.setGen("Comedie");
        SearchingFilter filtru2=builder.build();
        SearchingFilter filtru3=builder.build();
        System.out.println(filtru1.getConditiiFiltrare());
        System.out.println(filtru2.getConditiiFiltrare());
        System.out.println(filtru3.getConditiiFiltrare());
    }
}
