package tn.esprit.tp_ghada_azouz_4ds9.services.interfaces;

import tn.esprit.tp_ghada_azouz_4ds9.entity.Course;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Piste;

import java.util.List;

public interface IpisteService {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    void deletePiste(Long id);
    Piste getPiste(Long id);
    List<Piste> getAllPistes();
}
