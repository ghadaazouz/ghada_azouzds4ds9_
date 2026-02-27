package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Skier;

import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    void deleteSkier(Long id);
    Skier getSkier(Long id);
    List<Skier> getAllSkiers();
}
