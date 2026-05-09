package ModelFactoryMethodTransport.Clase;

public class Autobuz implements MijlocTransport{
    @Override
    public void pornesteInCursa(int traseu) {
        System.out.println("Porneste pe traseu " +traseu);
    }
}
