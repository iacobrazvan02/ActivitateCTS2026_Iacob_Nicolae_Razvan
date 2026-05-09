package ModelFactoryMethodTransport.Factory;

import ModelFactoryMethodTransport.Clase.Autobuz;
import ModelFactoryMethodTransport.Clase.MijlocTransport;

public class AutobuzFactory implements MijlocTransportFactory{
    @Override
    public MijlocTransport creareMijlocTransport() {
        return new Autobuz();
    }
}
