package ADAPTER.ADAPTER_B5Restaurant.main;

import ADAPTER.ADAPTER_B5Restaurant.clase.bar.SoftFacturiBar;
import ADAPTER.ADAPTER_B5Restaurant.clase.bar.SoftFacturiBarAdapter;
import ADAPTER.ADAPTER_B5Restaurant.clase.bucatarie.SoftFacturiBucatarie;

public class Main {
    public static void main(String[] args){
        SoftFacturiBar softFacturiBar = new SoftFacturiBar(" bere");
        SoftFacturiBucatarie softFacturiBucatarie = new SoftFacturiBucatarie(" Paste");

        softFacturiBar.tiparesteFactura();
        softFacturiBucatarie.printeazaFacturi();
        daFactura(softFacturiBucatarie);

        SoftFacturiBarAdapter softFacturiBarAdapter = new SoftFacturiBarAdapter(softFacturiBar);
        daFactura(softFacturiBarAdapter);
    }

    private static void daFactura(SoftFacturiBucatarie softFacturiBucatarie){
        softFacturiBucatarie.printeazaFacturi();
    }
}
