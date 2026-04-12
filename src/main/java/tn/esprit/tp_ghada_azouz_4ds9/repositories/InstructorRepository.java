package tn.esprit.tp_ghada_azouz_4ds9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
