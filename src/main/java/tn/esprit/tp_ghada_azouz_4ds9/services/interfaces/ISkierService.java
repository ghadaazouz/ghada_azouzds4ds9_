package tn.esprit.tp_ghada_azouz_4ds9.services.interfaces;

import tn.esprit.tp_ghada_azouz_4ds9.entities.Skier;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeSubscription;

import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    void deleteSkier(Long id);
    Skier getSkier(Long id);
    List<Skier> getAllSkiers();

    void assignSkierToPiste(Long numSkier, Long numPiste);
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);
    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription type);
}
