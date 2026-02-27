package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Registration;
import tn.esprit.tp_ghada_azouz_4ds9.repository.PisteRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repository.RegistrationRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IregistrationService;

import java.util.List;
@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements IregistrationService {
    private final RegistrationRepository registrationRepository;
    public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }

    @Override
    public Registration getRegistration(Long id) {
        return registrationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " + id));
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }
}
