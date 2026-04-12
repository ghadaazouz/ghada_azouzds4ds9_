package tn.esprit.tp_ghada_azouz_4ds9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Course;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    long countByCourse(Course course);

}
