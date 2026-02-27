package tn.esprit.tp_ghada_azouz_4ds9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}