package ModelFactoryMethodTransport.Main;

import ModelFactoryMethodTransport.Clase.Autobuz;
import ModelFactoryMethodTransport.Clase.MijlocTransport;
import ModelFactoryMethodTransport.Factory.AutobuzFactory;
import ModelFactoryMethodTransport.Factory.MijlocTransportFactory;
import ModelFactoryMethodTransport.Factory.TramvaiFactory;
import ModelFactoryMethodTransport.Factory.TroleibuzFactory;

public class Main {
    public static void main(String[] args){
        MijlocTransportFactory factoryAutobuz = new AutobuzFactory();
        MijlocTransport autobuz = factoryAutobuz.creareMijlocTransport();
        autobuz.pornesteInCursa(105);

        MijlocTransportFactory factoryTramvai = new TramvaiFactory();
        MijlocTransport tramvai = factoryTramvai.creareMijlocTransport();
        tramvai.pornesteInCursa(203);

        MijlocTransportFactory factoryTroleibuz = new TroleibuzFactory();
        MijlocTransport troleibuz = factoryTroleibuz.creareMijlocTransport();
        troleibuz.pornesteInCursa(317);
    }
}
