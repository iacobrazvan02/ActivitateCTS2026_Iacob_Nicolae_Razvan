package ModelFactoryMethodTransport.Clase;

public class Tramvai implements MijlocTransport{
    @Override
    public void pornesteInCursa(int traseu) {
        System.out.println("Porneste la drum" + traseu);

    }
}
