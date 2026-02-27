package tn.esprit.tp_ghada_azouz_4ds9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}