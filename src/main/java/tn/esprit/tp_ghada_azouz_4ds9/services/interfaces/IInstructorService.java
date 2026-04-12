package tn.esprit.tp_ghada_azouz_4ds9.services.interfaces;

import tn.esprit.tp_ghada_azouz_4ds9.entities.Instructor;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.Support;

import java.util.List;

public interface IInstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long id);
    Instructor getInstructor(Long id);
    List<Instructor> getAllInstructors();

    Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse);
    Instructor addInstructorAndAssignToCourses(Instructor instructor, List<Long> numCourses);
    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);
}
