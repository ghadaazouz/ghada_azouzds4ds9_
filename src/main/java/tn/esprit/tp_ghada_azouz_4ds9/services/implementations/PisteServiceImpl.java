package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Piste;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.PisteRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IPisteService;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPisteService {

    private final PisteRepository pisteRepository;

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
        //Methode1
        // return PisteRepository.findById(id).get();
        //Methode2
        return pisteRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Piste avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }

}
