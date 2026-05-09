package ModelServiceAuto.SimpleFactory;

import ModelServiceAuto.Singleton.AMasina;

public class MasinaFactory {
    public static AMasina getMasina(MasinaFactoryType type, String numarInmatriculare){
        if(type == MasinaFactoryType.SEDAN){
            return new SEDAN(numarInmatriculare);
        }
        if(type == MasinaFactoryType.SUV ){
            return new SUV(numarInmatriculare);
        }
        if(type == MasinaFactoryType.VAN){
            return new VAN(numarInmatriculare);
        }
        System.out.println("Tip invalid");
        return null;
    }
}
