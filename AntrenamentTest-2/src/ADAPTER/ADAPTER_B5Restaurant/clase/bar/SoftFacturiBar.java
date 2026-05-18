package ADAPTER.ADAPTER_B5Restaurant.clase.bar;

public class SoftFacturiBar {
    private String nume;

    public SoftFacturiBar(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void tiparesteFactura(){
        System.out.println("Factura " + this.nume + " a fost tiparita cu succes");
    }
}
