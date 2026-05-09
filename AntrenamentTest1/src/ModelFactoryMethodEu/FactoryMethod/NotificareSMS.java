package ModelFactoryMethodEu.FactoryMethod;

public class NotificareSMS implements INotificare{
    @Override
    public void trimite(String mesaj) {
        System.out.println("Primeste notificare prin sms: " + mesaj);
    }
}
