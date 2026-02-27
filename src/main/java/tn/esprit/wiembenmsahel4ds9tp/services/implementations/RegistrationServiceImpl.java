package tn.esprit.wiembenmsahel4ds9tp.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.wiembenmsahel4ds9tp.entities.Registration;
import tn.esprit.wiembenmsahel4ds9tp.repositories.RegistrationRepository;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.IRegistrationService;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements IRegistrationService {

    private final RegistrationRepository registrationRepository;

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
        //Methode1
        // return RegistrationRepository.findById(id).get();
        //Methode2
        return registrationRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Registration avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }
}
