package tn.esprit.wiembenmsahel4ds9tp.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.wiembenmsahel4ds9tp.entities.Skier;
import tn.esprit.wiembenmsahel4ds9tp.repositories.SkierRepository;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.ISkierService;

import java.util.List;

@Service
@AllArgsConstructor
public class SkierServiceImpl implements ISkierService {

    private final SkierRepository skierRepository;

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public void deleteSkier(Long id) {
        skierRepository.deleteById(id);
    }

    @Override
    public Skier getSkier(Long id) {
        //Methode1
        // return SkierRepository.findById(id).get();
        //Methode2
        return skierRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Skier avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Skier> getAllSkiers() {
        return skierRepository.findAll();
    }
}
