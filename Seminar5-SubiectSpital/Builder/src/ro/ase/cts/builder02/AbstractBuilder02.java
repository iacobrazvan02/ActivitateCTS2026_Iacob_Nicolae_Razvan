package ro.ase.cts.builder02;

import ro.ase.cts.builder01.Internare;

public interface AbstractBuilder02 {
    Internare02 build(String nume);
    AbstractBuilder02 setPatRabatabil(boolean patRabatabil);
    AbstractBuilder02 setArePapuci(boolean arePapuci);
    AbstractBuilder02 setAreHalat(boolean areHalat);
    AbstractBuilder02 setMicDejun(boolean micDejun);
}
