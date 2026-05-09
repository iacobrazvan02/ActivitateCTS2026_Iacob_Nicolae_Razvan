package ModelFactoryMethodEu.Main;

import ModelFactoryMethodEu.FactoryMethod.INotificare;
import ModelFactoryMethodEu.FactoryMethod.INotificareFactory;
import ModelFactoryMethodEu.FactoryMethod.NotificareEmail;
import ModelFactoryMethodEu.FactoryMethod.NotificareEmailFactory;

public class Main {
    public static void main (String[] args){
        INotificareFactory notificareEmail= new NotificareEmailFactory();
        INotificare notificare = notificareEmail.creareMesaj();
        notificare.trimite("Am ajuns");
    }
}
