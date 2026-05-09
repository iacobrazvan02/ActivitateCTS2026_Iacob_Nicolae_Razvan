package ModelFactoryMethodTransport.Factory;

import ModelFactoryMethodTransport.Clase.MijlocTransport;
import ModelFactoryMethodTransport.Clase.Tramvai;

public class TramvaiFactory implements MijlocTransportFactory{
    @Override
    public MijlocTransport creareMijlocTransport() {
        return new Tramvai();
    }
}
