package ModelFactoryMethodEu.FactoryMethod;

public class NotificareSMSFactory implements INotificareFactory{
    @Override
    public INotificare creareMesaj() {
        return new NotificareSMS();
    }
}
