package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Skier;
import tn.esprit.tp_ghada_azouz_4ds9.repository.RegistrationRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repository.SkierRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IskierService;

import java.util.List;
@Service
@AllArgsConstructor
public class SkierServiceImpl implements IskierService {
    private final SkierRepository skierRepository;
    public SkierServiceImpl(SkierRepository skierRepository) {
        this.skierRepository = skierRepository;
    }
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
        return skierRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " + id));
    }

    @Override
    public List<Skier> getAllSkiers() {
        return skierRepository.findAll();
    }
}
