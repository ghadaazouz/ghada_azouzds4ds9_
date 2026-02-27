package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    void deletePiste(Long id);
    Piste getPiste(Long id);
    List<Piste> getAllPistes();
}
