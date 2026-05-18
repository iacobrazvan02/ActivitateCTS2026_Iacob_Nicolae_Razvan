package ADAPTER.ADAPTER_B5Restaurant.clase.bar;

import ADAPTER.ADAPTER_B5Restaurant.clase.bucatarie.SoftFacturiBucatarie;

import static jdk.internal.org.jline.utils.Colors.s;

public class SoftFacturiBarAdapter  extends SoftFacturiBucatarie {
    private SoftFacturiBar softFacturiBar;

    public SoftFacturiBarAdapter(SoftFacturiBar softFacturiBar){
        super(softFacturiBar.getNume());
        this.softFacturiBar = softFacturiBar;
    }

    public SoftFacturiBarAdapter(String nume) {
        super(nume);
    }

    @Override
    public void printeazaFacturi() {
        softFacturiBar.tiparesteFactura();
    }
}
