package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Skier;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.TypeSubscription;

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
