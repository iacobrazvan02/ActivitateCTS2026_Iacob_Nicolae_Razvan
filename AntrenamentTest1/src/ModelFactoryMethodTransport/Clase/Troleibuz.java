package ModelFactoryMethodTransport.Clase;

public class Troleibuz implements MijlocTransport{
    @Override
    public void pornesteInCursa(int traseu) {
        System.out.println("Porneste la drum " + traseu);
    }
}
