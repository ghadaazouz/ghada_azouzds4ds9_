package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Course;
import tn.esprit.tp_ghada_azouz_4ds9.repository.CourseRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.ICourseService;

import java.util.List;

@Service
@AllArgsConstructor

public class CourseServiceImpl implements ICourseService {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

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
        return courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " + id));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
