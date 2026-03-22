package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    void deleteRegistration(Long id);
    Registration getRegistration(Long id);
    List<Registration> getAllRegistrations();

    Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier);
    Registration assignRegistrationToCourse(Long numRegistration, Long numCourse);
    Registration addRegistrationAndAssignToSkierAndCourse(Registration registration, Long numSkier, Long numCourse);
}
