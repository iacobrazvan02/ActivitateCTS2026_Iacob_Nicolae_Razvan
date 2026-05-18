package ADAPTER.ADAPTER_B5Restaurant.clase.bucatarie;

public class SoftFacturiBucatarie {
    private String nume;

    public SoftFacturiBucatarie(String nume) {
        this.nume = nume;
    }

    public void printeazaFacturi(){
        System.out.println(" A fost printata factura" + this.nume);
    }
}
