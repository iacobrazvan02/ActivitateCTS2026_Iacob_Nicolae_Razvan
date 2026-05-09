package ModelBauturi2.Model;

public class CiocolataCalda extends BauturaAbstracta{
    public CiocolataCalda(String name, double volum, double pret) {
        super(name, volum, pret);
    }

    @Override
    public void metodaDePreparare() {
        System.out.println("se pune plic in lapte cald shshshshshhsh");
    }
}
