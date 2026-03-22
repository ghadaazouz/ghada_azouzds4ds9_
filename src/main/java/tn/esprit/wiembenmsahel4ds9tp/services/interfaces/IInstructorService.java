package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Instructor;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.Support;

import java.util.List;

public interface IInstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long id);
    Instructor getInstructor(Long id);
    List<Instructor> getAllInstructors();

    Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse);
    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);
}
