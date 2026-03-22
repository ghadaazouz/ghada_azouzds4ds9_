package tn.esprit.wiembenmsahel4ds9tp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.wiembenmsahel4ds9tp.entities.Course;
import tn.esprit.wiembenmsahel4ds9tp.entities.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    long countByCourse(Course course);

}
