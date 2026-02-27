package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Piste;
import tn.esprit.tp_ghada_azouz_4ds9.repository.InstructorRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repository.PisteRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IpisteService;

import java.util.List;
@Service
@AllArgsConstructor
public class PisteServiceImpl implements IpisteService {
    private final PisteRepository pisteRepository;
    public PisteServiceImpl(PisteRepository pisteRepository) {
        this.pisteRepository = pisteRepository;
    }
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void deletePiste(Long id) {
        pisteRepository.deleteById(id);
    }

    @Override
    public Piste getPiste(Long id) {
        return pisteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " + id));
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }
}
