package ModelServiceAuto.Singleton;

public abstract class AMasina {
    private String numarInmatriculare;

    public AMasina(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    // Metodă ce va fi implementată de clasele derivate (SUV, VAN, SEDAN, etc.)
    public abstract void afiseazaDetaliiMasina();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

