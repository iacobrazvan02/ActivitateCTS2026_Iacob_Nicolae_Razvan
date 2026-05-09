package ModelFactoryMethodEu.FactoryMethod;

public class NotificareEmailFactory implements INotificareFactory{
    @Override
    public INotificare creareMesaj() {
        return new NotificareEmail();
    }
}
