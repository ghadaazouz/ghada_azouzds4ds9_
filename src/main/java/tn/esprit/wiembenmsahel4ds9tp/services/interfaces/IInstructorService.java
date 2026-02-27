package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Instructor;

import java.util.List;

public interface IInstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long id);
    Instructor getInstructor(Long id);
    List<Instructor> getAllInstructors();
}
