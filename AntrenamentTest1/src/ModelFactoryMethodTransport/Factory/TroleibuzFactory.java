package ModelFactoryMethodTransport.Factory;

import ModelFactoryMethodTransport.Clase.MijlocTransport;
import ModelFactoryMethodTransport.Clase.Troleibuz;

public class TroleibuzFactory implements MijlocTransportFactory{

    @Override
    public MijlocTransport creareMijlocTransport() {
        return new Troleibuz();
    }
}
