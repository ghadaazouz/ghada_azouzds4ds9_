package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Course;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Instructor;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Registration;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.Support;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.CourseRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.InstructorRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IInstructorService;

import java.util.ArrayList;
import java.util.HashSet;
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

        instructor.getCourses().add(course);

        return instructorRepository.save(instructor);
    }//association unidirectionnelle
    //instructor ne se trouve pas dans Bd course se trouve
    //instructor a plusieurs cours


    //ajout liste des courses
    @Override
    public Instructor addInstructorAndAssignToCourses(Instructor instructor, List<Long> numCourses) {
        List<Course> courses = courseRepository.findAllById(numCourses);
        courses.forEach( course ->{
            instructor.getCourses().add(course);
        });
        Set<Course> courseSet = new HashSet<>();
        for (Course course : courses){ //parcours list ily 3andi minhoum zouz mouch bich yet3ada lil set -> cours filtrée
            courseSet.add(course);
        }

        instructor.setCourses(courseSet);
        return instructorRepository.save(instructor);

    }

    //set pas de doublons
    //list on peut trouver des doublons
    //findAllById : retourne une list

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
