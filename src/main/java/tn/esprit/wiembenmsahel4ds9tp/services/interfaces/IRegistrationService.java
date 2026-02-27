package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    void deleteRegistration(Long id);
    Registration getRegistration(Long id);
    List<Registration> getAllRegistrations();
}
