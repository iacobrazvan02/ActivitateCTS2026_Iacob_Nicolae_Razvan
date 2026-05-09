package ModelFactoryMethodEu.FactoryMethod;

public class NotificareEmail implements INotificare{
    @Override
    public void trimite(String mesaj) {
        System.out.println("Primeste notificare prin email: " + mesaj);
    }
}
