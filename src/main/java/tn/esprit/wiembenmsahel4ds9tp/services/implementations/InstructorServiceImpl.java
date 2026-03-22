package tn.esprit.wiembenmsahel4ds9tp.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.wiembenmsahel4ds9tp.entities.Course;
import tn.esprit.wiembenmsahel4ds9tp.entities.Instructor;
import tn.esprit.wiembenmsahel4ds9tp.entities.Registration;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.Support;
import tn.esprit.wiembenmsahel4ds9tp.repositories.CourseRepository;
import tn.esprit.wiembenmsahel4ds9tp.repositories.InstructorRepository;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.IInstructorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class InstructorServiceImpl implements IInstructorService {

    private final InstructorRepository instructorRepository;
    private final CourseRepository courseRepository;

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }

    @Override
    public Instructor getInstructor(Long id) {
        //Methode1
        // return InstructorRepository.findById(id).get();
        //Methode2
        return instructorRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Instructor avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse) {
        Course course = courseRepository.findById(numCourse)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        instructor.setCourses(Set.of(course));

        return instructorRepository.save(instructor);
    }

    @Override
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support) {
        Instructor instructor = instructorRepository.findById(numInstructor)
                .orElseThrow(() -> new RuntimeException("Instructor not found"));

        List<Integer> weeks = new ArrayList<>();

        for (Course c : instructor.getCourses()) {
            if (c.getSupport() == support) {
                for (Registration r : c.getRegistrations()) {
                    weeks.add(r.getNumWeek());
                }
            }
        }

        return weeks;
    }

}
