package tn.esprit.tp_ghada_azouz_4ds9.services.interfaces;

import tn.esprit.tp_ghada_azouz_4ds9.entity.Registration;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Skier;

import java.util.List;

public interface IskierService {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    void deleteSkier(Long id);
    Skier getSkier(Long id);
    List<Skier> getAllSkiers();
}
