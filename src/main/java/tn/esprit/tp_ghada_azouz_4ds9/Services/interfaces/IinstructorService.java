package tn.esprit.tp_ghada_azouz_4ds9.services.interfaces;

import tn.esprit.tp_ghada_azouz_4ds9.entity.Course;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Instructor;

import java.util.List;

public interface IinstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long id);
    Instructor getInstructor(Long id);
    List<Instructor> getAllInstructors();
}
