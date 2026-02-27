package tn.esprit.tp_ghada_azouz_4ds9.services.interfaces;

import tn.esprit.tp_ghada_azouz_4ds9.entity.Piste;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Registration;

import java.util.List;

public interface IregistrationService {
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    void deleteRegistration(Long id);
    Registration getRegistration(Long id);
    List<Registration> getAllRegistrations();
}
