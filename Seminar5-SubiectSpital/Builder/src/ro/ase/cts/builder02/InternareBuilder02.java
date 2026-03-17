package ro.ase.cts.builder02;

import ro.ase.cts.builder01.Internare;

public class InternareBuilder02 implements AbstractBuilder02{
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halat;

    public InternareBuilder02() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciCamera = false;
        this.halat = false;
    }

    @Override
    public Internare02 build(String nume) {
        return new Internare02(nume,patRabatabil, micDejunInclus, papuciCamera, halat);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setArePapuci(boolean arePapuci) {
        this.papuciCamera = arePapuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreHalat(boolean areHalat) {
        this.halat = areHalat;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejun(boolean micDejun) {
        this.micDejunInclus = micDejun;
        return this;
    }
}
