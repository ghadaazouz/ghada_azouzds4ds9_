package tn.esprit.wiembenmsahel4ds9tp.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.wiembenmsahel4ds9tp.entities.Course;
import tn.esprit.wiembenmsahel4ds9tp.repositories.CourseRepository;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.ICourseService;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private final CourseRepository courseRepository;

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course getCourse(Long id) {
        // A verifier
        //Methode1
        // return CourseRepository.findById(id).get();
        //Methode2
        return courseRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Course avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

}
