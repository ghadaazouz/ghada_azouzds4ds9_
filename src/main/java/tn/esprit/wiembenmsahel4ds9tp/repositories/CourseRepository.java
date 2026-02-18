package tn.esprit.wiembenmsahel4ds9tp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.wiembenmsahel4ds9tp.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
